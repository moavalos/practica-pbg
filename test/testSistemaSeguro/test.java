package testSistemaSeguro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sistemaSeguro.Admin;
import sistemaSeguro.Basico;
import sistemaSeguro.InvalidPasswordException;
import sistemaSeguro.Sistema;
import sistemaSeguro.UserNotFoundException;

public class test {

	@Test
	public void agregarUsuarioBasicoExitoso() throws UserNotFoundException, InvalidPasswordException {
		Sistema sistemaSeguro = new Sistema();
		Basico usuario = new Basico("usuario1", "HDhdusai5");

		sistemaSeguro.agregarUsuario(usuario);

		Integer esperado = 1;
		Integer obtenido = sistemaSeguro.getCantidadUsuarios();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void eliminarUsuarioBasicoExitoso() throws UserNotFoundException, InvalidPasswordException {

		Sistema sistemaSeguro = new Sistema();
		Basico usuario = new Basico("usuario1", "HDhdusai5");

		sistemaSeguro.agregarUsuario(usuario);
		sistemaSeguro.eliminarUsuario(usuario);

		assertNull(sistemaSeguro.buscarUsuario("usuario1"));
	}

	@Test
	public void eliminarUsuarioNoEliminable()
			throws UserNotFoundException, ClassCastException, InvalidPasswordException {
		Sistema sistemaSeguro = new Sistema();
		Admin usuario = new Admin("admin", "HDhdusai5!");

		sistemaSeguro.agregarUsuario(usuario);
		sistemaSeguro.eliminarUsuario(usuario);

		assertFalse(usuario.isEliminado());
	}

	@Test
	public void bloquearUsuarioExitoso() throws UserNotFoundException, InvalidPasswordException {
		Sistema sistemaSeguro = new Sistema();
		Basico usuario = new Basico("usuario1", "HDhdusai5");

		sistemaSeguro.agregarUsuario(usuario);
		usuario.incrementarIntentosFallidos();
		usuario.incrementarIntentosFallidos();
		usuario.incrementarIntentosFallidos();
		usuario.incrementarIntentosFallidos();
		sistemaSeguro.bloquearUsuario(usuario);

		assertTrue(usuario.isBloqueado());
	}

	@Test
	public void bloquearUsuarioFallido() throws UserNotFoundException, InvalidPasswordException {

		Sistema sistemaSeguro = new Sistema();
		Admin usuario = new Admin("admin", "HDhdusai5!");

		sistemaSeguro.agregarUsuario(usuario);
		sistemaSeguro.bloquearUsuario(usuario);

		assertFalse(usuario.isBloqueado());
	}

	@Test
	public void validarPasswordUsuarioBasico() throws InvalidPasswordException {

		Sistema sistemaSeguro = new Sistema();

		String contraseñaBasico1 = "Password123";
		String contraseñaBasico2 = "Abcdefg1";

		assertTrue(sistemaSeguro.esContraseñaValida(contraseñaBasico1, false));
		assertTrue(sistemaSeguro.esContraseñaValida(contraseñaBasico2, false));

	}

	@Test
	public void validarPasswordAdmin() throws InvalidPasswordException {

		Sistema sistemaSeguro = new Sistema();

		String contraseñaAdmin1 = "Admin123!";
		String contraseñaAdmin2 = "Abcde@123";

		assertTrue(sistemaSeguro.esContraseñaValida(contraseñaAdmin1, true));
		assertTrue(sistemaSeguro.esContraseñaValida(contraseñaAdmin2, true));

	}

	@Test
	public void passwordInvalidas() throws InvalidPasswordException {

		Sistema sistemaSeguro = new Sistema();
		String contraseñaInvalida1 = "password";
		String contraseñaInvalida2 = "ABCDE123";

		assertFalse(sistemaSeguro.esContraseñaValida(contraseñaInvalida1, false));
		assertFalse(sistemaSeguro.esContraseñaValida(contraseñaInvalida2, false));

	}

	// Intentar generar un usuario con una contraseña inválida debe arrojar la
	// excepción unlam.pb2.InvalidPassword
	/*
	 * @Test public void usuarioContraseñaInvalida() throws UserNotFoundException,
	 * InvalidPasswordException {
	 * 
	 * Sistema sistemaSeguro = new Sistema(); Basico usuario = new
	 * Basico("usuario1", "123");
	 * 
	 * sistemaSeguro.agregarUsuario(usuario);
	 * 
	 * Integer esperado = 0; Integer obtenido = sistemaSeguro.getCantidadUsuarios();
	 * assertEquals(esperado, obtenido);
	 * 
	 * }
	 */

}
