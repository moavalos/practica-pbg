package testTorneoArqueria;

import org.junit.Test;
import static org.junit.Assert.*;

import torneoArqueria.Atracador;
import torneoArqueria.Banco;
import torneoArqueria.Banda;
import torneoArqueria.Vigilancia;
import torneoArqueria.Persona;

public class test {

	@Test
	public void testQueRegistroUnBanco() {
		Vigilancia vigilancia = new Vigilancia("Nombre De la Compania de Vigilancia");

		Integer idbanco = 1;
		Banco banco = new Banco(idbanco, "la Casa de Papel");
		vigilancia.agregarBanco(banco);

	}

	@Test
	public void quePuedaRegistrarUnAtracador() {
		Vigilancia vigilancia = new Vigilancia ("Nombre De la Compania de Vigilancia");
		Integer idbanda = 1;
		String nombre="La Casa de Papel";
		Banda banda = new Banda (idbanda,nombre);
		
		Integer dni= 1;
		nombre="Ursula";
		String apellido= "Corbero";
		String apodo="Tokio";
		
		//No Cambiar esta Linea
		Persona atracador = new Atracador (dni, nombre, apellido,apodo,banda );
		vigilancia.registrarPersona (atracador);
		Integer valorEsperado = 1;
		
		//Compleatar el Assert
		assertEquals(valorEsperado, );
		
	}

	@Test(expected = PersonaDuplicadaException.class)
	public void queCuandoSeRegistre2PersonasConElMismoDNiLanceUnaExpcionPersonaDuplicadaException() {
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

	}

	@Test
	public void queSePuedaRegistraUnAtraco() {

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

		vigilancia.registrarAtraco(dni, id_banco);
		Integer valorEsperado = 1;

		Integer claveAtraco = 1;
		Atraco atraco = vigilancia.buscarAtracoPorClave(claveAtraco);

		Banco bancoEsperado = new Banco(idBanco, "la Casa de Papel");

		// No cambiar
		assertTrue(bancoEsperado.equals(atraco.getBanco()));

	}

	@Test
	private void queSePuedaObtenerLosAtracadoresOrdenadosPorApodos() {

	}

//Cree un 3 test a su eleccion para que pruebe el resto de las funcionalidades
	@Test
	private void testSignificativo1() {

	}

	@Test
	private void testSignificativo2() {

	}

	@Test
	private void testSignificativo3() {

	}

}
