package sistemaSeguro;

public class Usuario implements Comparable<Usuario> {

	private String nombreUsuario;
	private String password;
	private boolean eliminable;

	public Usuario(String nombreUsuario, String password) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.eliminable = false;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEliminable() {
		return eliminable;
	}

	public void setEliminable(boolean eliminable) {
		this.eliminable = eliminable;
	}

	public boolean verificarContraseña(String contraseña) {
		return this.password.equals(contraseña);
	}

	@Override
	public int compareTo(Usuario otroUsuario) {
		return this.nombreUsuario.compareTo(otroUsuario.nombreUsuario);
	}

}
