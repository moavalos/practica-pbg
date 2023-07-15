package sistemaSeguro;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Usuario> usuarios;

	public Sistema() {
		this.usuarios = new ArrayList<>();
	}

	public void agregarUsuario(Usuario usuario) throws UserNotFoundException, InvalidPasswordException {
		if (buscarUsuario(usuario.getNombreUsuario()) != null) {
			throw new UserNotFoundException("El usuario ya existe en la base de datos.");
		}
		usuarios.add(usuario);
		ordenarUsuariosPorNombre();
		
		Boolean esAdministrador = usuario instanceof Admin;
        if (!esContraseñaValida(usuario.getPassword(), esAdministrador)) {
            throw new InvalidPasswordException("La contraseña no cumple con los requisitos.");
        }
	}

	public Integer getCantidadUsuarios() {
		return this.usuarios.size();
	}

	public void eliminarUsuario(Usuario usuario) throws ClassCastException {
		if (!(usuario instanceof Eliminable)) {
			throw new ClassCastException("No se puede eliminar el usuario.");
		}

		usuarios.remove(usuario);
	}

	public void bloquearUsuario(Usuario usuario) {
		if (usuario instanceof Bloqueable) {
			Bloqueable bloqueable = (Bloqueable) usuario;
			bloqueable.incrementarIntentosFallidos();

			if (bloqueable.getIntentosFallidos() >= 3) {
				bloqueable.setBloqueado(true);
			}
		}
	}

	public Usuario buscarUsuario(String nombreUsuario) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNombreUsuario().equals(nombreUsuario)) {
				return usuario;
			}
		}
		return null;
	}

	private void ordenarUsuariosPorNombre() {
		usuarios.sort((usuario1, usuario2) -> usuario1.getNombreUsuario().compareTo(usuario2.getNombreUsuario()));
	}

	public Boolean esContraseñaValida(String contraseña, Boolean esAdministrador) {
		// requisitos de contraseña basico
		Boolean tieneNumero = false;
		Boolean tieneMinuscula = false;
		Boolean tieneMayuscula = false;

		// requisitos de contraseña admin
		Boolean tieneCaracterEspecial = false;
		Boolean tieneSecuenciaLarga = false;

		for (int i = 0; i < contraseña.length(); i++) {
			char c = contraseña.charAt(i);

			if (Character.isDigit(c)) {
				tieneNumero = true;
			} else if (Character.isLowerCase(c)) {
				tieneMinuscula = true;
			} else if (Character.isUpperCase(c)) {
				tieneMayuscula = true;
			} else if (esAdministrador && !Character.isLetterOrDigit(c)) {
				tieneCaracterEspecial = true;
			}

			if (i > 2 && contraseña.charAt(i - 2) + 1 == c && contraseña.charAt(i - 1) + 1 == c) {
				tieneSecuenciaLarga = true;
			}
		}

		// segun el tipo de usuario
		if (esAdministrador) {
			return tieneNumero && tieneMinuscula && tieneMayuscula && tieneCaracterEspecial && !tieneSecuenciaLarga;
		} else {
			return tieneNumero && tieneMinuscula && tieneMayuscula;
		}
	}

}
