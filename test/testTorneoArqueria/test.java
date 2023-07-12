package testTorneoArqueria;

import static org.junit.Assert.*;
import org.junit.Test;

import torneoArqueria.Atracador;
import torneoArqueria.Atraco;
import torneoArqueria.Banco;
import torneoArqueria.BancoNoEncontradoException;
import torneoArqueria.Banda;
import torneoArqueria.ClaveInexistenteException;
import torneoArqueria.NoSeEncuentraAtracadorException;
import torneoArqueria.Vigilancia;
import torneoArqueria.Vigilante;
import torneoArqueria.Persona;
import torneoArqueria.PersonaDuplicadaException;

public class test {

	@Test
	public void testQueRegistroUnBanco() {

		Vigilancia vigilancia = new Vigilancia("Nombre De la Compania de Vigilancia");
		Integer idbanco = 1;
		Banco banco = new Banco(idbanco, "la Casa de Papel");
		vigilancia.agregarBanco(banco);
		Integer cantidadEsperada = 1;
		assertEquals(cantidadEsperada, vigilancia.getCantidadBancos());

	}

	@Test
	public void quePuedaRegistrarUnAtracador() throws PersonaDuplicadaException {
		Vigilancia vigilancia = new Vigilancia("Nombre De la Compania de Vigilancia");
		Integer idbanda = 1;
		String nombre = "La Casa de Papel";
		Banda banda = new Banda(idbanda, nombre);

		Integer dni = 1;
		nombre = "Ursula";
		String apellido = "Corbero";
		String apodo = "Tokio";

		// No Cambiar esta Linea
		Persona atracador = new Atracador(dni, nombre, apellido, apodo, banda);
		vigilancia.registrarPersona(atracador);
		Integer valorEsperado = 1;

		// Compleatar el Assert
		assertEquals(valorEsperado, vigilancia.getCantidadPersonas());

	}

	@Test
	public void queCuandoSeRegistre2PersonasConElMismoDNiLanceUnaExpcionPersonaDuplicadaException()
			throws PersonaDuplicadaException {
		Vigilancia vigilancia = new Vigilancia("Nombre De la Compania de Vigilancia");
		// Creo Vigilante

		Persona vigilante = new Vigilante(1, "Pepito", "Pistolero", new Banco(1, "LA Casa De Papel"));
		vigilancia.registrarPersona(vigilante);
		// Creo Banda
		Integer idBanda = 1;
		String nombre = "La Casa de Papel";
		Banda banda = new Banda(idBanda, nombre);
		// Creo Atracador
		Integer dni = 1;
		nombre = "Ursula";
		String apellido = "Corbero";
		String apodo = "Tokio";
		// No Cambiar esta Linea
		Persona atracador = new Atracador(dni, nombre, apellido, apodo, banda);
		vigilancia.registrarPersona(atracador);

		assertThrows(PersonaDuplicadaException.class, () -> {
			vigilancia.registrarPersona(atracador);
		});

	}

	@Test
	public void queSePuedaRegistraUnAtraco() throws PersonaDuplicadaException, NoSeEncuentraAtracadorException,
			BancoNoEncontradoException, ClaveInexistenteException {

		Vigilancia vigilancia = new Vigilancia("Nombre De la Compania de Vigilancia");
		Integer idBanda = 1;
		String nombre = "La Casa de Papel";
		Banda banda = new Banda(idBanda, nombre);

		Integer dni = 1;
		nombre = "Ursula";
		String apellido = "Corbero";
		String apodo = "Tokio";

		// No Cambiar esta Linea
		Persona atracador = new Atracador(dni, nombre, apellido, apodo, banda);
		vigilancia.registrarPersona(atracador);

		Integer idBanco = 1;
		Banco banco = new Banco(idBanco, "la Casa de Papel");
		vigilancia.agregarBanco(banco);

		vigilancia.registrarAtraco(dni, idBanco);

		Integer claveAtraco = 1;
		Atraco atraco = vigilancia.buscarAtracoPorClave(claveAtraco);

		Banco bancoEsperado = new Banco(idBanco, "la Casa de Papel");

		// No cambiar
		assertTrue(bancoEsperado.equals(atraco.getBanco()));

	}

}
