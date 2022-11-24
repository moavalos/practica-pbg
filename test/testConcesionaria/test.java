package testConcesionaria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Test;

import Concesionaria.Coche;
import Concesionaria.Concesionaria;
import Concesionaria.patenteInvalida;
import Concesionaria.patenteNoExisteException;

public class test {
	@Test
	public void crearConcesionaria() {
		Concesionaria c = new Concesionaria("Consesionaria con S");

	}

	@Test
	public void crearCoche() {
		// patente, marca, modelo, precio
		Coche auto = new Coche("HSS 911", "Fiat", "Palio", 10.0);
	}

	@Test
	public void queSePuedaAgregarUnAutoALaConcesionaria() {
		Concesionaria concesionaria = new Concesionaria("MrGuarango");
		Coche auto = new Coche("HSS 911", "Fiat", "Palio", 10.0);

		concesionaria.agregarCoche(auto);
		Integer valorEsperado = 1;
		Integer valorObtenido = concesionaria.obtenerCantidadDeCoches();
		assertEquals(valorEsperado, valorObtenido);
		// assertEquals(1, concesionaria.obtenerCantidadDeCoches());

	}

	@Test
	public void queSePuedaEliminarUnAutoALaConcesionaria() {
		Concesionaria concesionaria = new Concesionaria("MrGuarango");
		Coche auto = new Coche("HSS 911", "Fiat", "Palio", 10.0);
		Coche auto2 = new Coche("JOB 809", "no se", "tampoco se", 10.0);

		concesionaria.agregarCoche(auto);
		concesionaria.agregarCoche(auto2);
		// remove
		concesionaria.eliminarCoche(auto);

		Integer valorEsperado = 1;
		Integer valorObtenido = concesionaria.obtenerCantidadDeCoches();
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedanMostrarTodosLosCochesDeLaConcesionaria() {
		Concesionaria concesionaria = new Concesionaria("MrGuarango");
		Coche auto = new Coche("HSS 911", "Fiat", "Palio", 10.0);
		Coche auto2 = new Coche("JOB 809", "no se", "tampoco se", 10.0);
		concesionaria.agregarCoche(auto);
		concesionaria.agregarCoche(auto2);
		// ToString
		System.out.println(concesionaria.mostrarCoches());

	}

	@Test
	public void queNoSePuedaAgregarDosAutosConLaMismaPatente() {
		Concesionaria concesionaria = new Concesionaria("MrGuarango");
		Coche auto = new Coche("HSS 911", "Fiat", "Palio", 10.0);
		Coche auto2 = new Coche("HSS 911", "no se", "tampoco se", 10.0);
		concesionaria.agregarCoche(auto);
		concesionaria.agregarCoche(auto2);
		Integer resultadoEsperado = 1;
		// espera 1 solo auto, no puede esperar 2 porq tienen la misma patente.
		Integer resultadoObtenido = concesionaria.obtenerCantidadDeCoches();

		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void queSePuedaBuscarUnAutoPorPatente() throws patenteNoExisteException, patenteInvalida {
		Concesionaria concesionaria = new Concesionaria("MrGuarango");
		String patente = "HSSFHSIHO";
		Coche auto = new Coche(patente, "Fiat", "Palio", 10.0);
		concesionaria.agregarCoche(auto);
		Coche cocheEncontrado = concesionaria.buscarPorPatente(patente);
		// en valorEsperado me traigo la patente que busc� el metodo buscarPatente y la
		// comparo con la patente que cre�
		assertEquals(patente, cocheEncontrado.getPatente());
	}

	@Test
	public void queSePuedaBuscarAutosPorMarca() {
		// ESTO DE ALGUNA MANERA ESTA MAL
		Concesionaria concesionaria = new Concesionaria("Milanesa");
		String marca = "BMW";
		Coche auto1 = new Coche("AF 546 HJ", marca, "M3", 130000.0);
		String marca2 = "BMW";
		Coche auto2 = new Coche("AG 377 AJ", marca2, "M2", 950000.0);

		concesionaria.agregarCoche(auto1);
		concesionaria.agregarCoche(auto2);

		// creo dos listas como referencia a los resultados que espero y obtengo. los
		// agregro a la lista esperada y si en la lista de coches obtenidos est� la
		// marca que estoy buscando --- ya no puedo analizar mas codigo
		ArrayList<Coche> autosEsperados = new ArrayList<>();
		ArrayList<Coche> autosObtenidos = new ArrayList<>();
		autosEsperados.add(auto1);
		autosEsperados.add(auto2);

		autosObtenidos = concesionaria.buscarPorMarca(marca);
		// que carajo hice no se no pregunten pero creo q esta bien
		assertEquals(autosEsperados.get(0).getMarca(), autosObtenidos.get(1).getMarca());
		// actualizacion del analisis: comparo las marcas de las listas, si son iguales
		// es true pero que carajos hace el get() ?????.
		// el get de arrayList se usa para obtener el elemento de un �ndice espec�fico
		// dentro de la lista.
	}

	@Test
	public void queSePuedaOrdenarPorMarcaYModelo() {
		Concesionaria concesionaria = new Concesionaria("JFDKLSA");
		Coche auto = new Coche("AF 546 HJ", "BMW", "M3", 130000.0);
		Coche auto2 = new Coche("AE 223 DG", "Volkswagen", "Scirocco", 35000.0);
		Coche auto3 = new Coche("AA 420 EG", "Mercedez", "A45", 65000.0);
		Coche auto4 = new Coche("AE 223 DG", "Volkswagen", "Golf GTI", 35000.0);

		concesionaria.agregarCoche(auto);
		concesionaria.agregarCoche(auto2);
		concesionaria.agregarCoche(auto3);
		concesionaria.agregarCoche(auto4);

		TreeSet<Coche> autosEsperados = new TreeSet<>();
		autosEsperados.add(auto);
		autosEsperados.add(auto2);
		autosEsperados.add(auto3);
		autosEsperados.add(auto4);
		// agrego coches a la concesionaria, al treeSet me agrego dos listas con valores
		// esperados y obetnidos, los ordendo y comparo con el assertEquals
		// toda la logica esta en la interfaz comparator

		TreeSet<Coche> autosObtenidos = new TreeSet<>();
		autosObtenidos = concesionaria.ordenarPorMarcaYModelo();
		assertEquals(autosEsperados, autosObtenidos);
	}

	@Test
	public void queSePuedaOrdenarCochesPorPrecioYPatente() {
		Concesionaria concesionaria = new Concesionaria("JFDKLSA");
		Coche auto = new Coche("AF 546 HJ", "BMW", "M3", 130000.0);
		Coche auto2 = new Coche("AE 223 DG", "Volkswagen", "Scirocco", 35000.0);
		Coche auto3 = new Coche("AA 420 EG", "Mercedez", "A45", 65000.0);
		Coche auto4 = new Coche("AE 223 DG", "Volkswagen", "Golf GTI", 35000.0);
		concesionaria.agregarCoche(auto);
		concesionaria.agregarCoche(auto2);
		concesionaria.agregarCoche(auto3);
		concesionaria.agregarCoche(auto4);

		TreeSet<Coche> autosEsperados = new TreeSet<>();
		autosEsperados.add(auto);
		autosEsperados.add(auto2);
		autosEsperados.add(auto3);
		autosEsperados.add(auto4);

		TreeSet<Coche> autosObtenidos = new TreeSet<>();
		autosObtenidos = concesionaria.ordenarPorPrecioYPatente();
		assertEquals(autosEsperados, autosObtenidos);

	}

	@Test(expected = patenteInvalida.class)
	public void validarQueSeProduzcaUnaExcepcionSiLaPatenteEsInvalida() throws patenteInvalida {
		Concesionaria concesionaria = new Concesionaria("AYUDA");
		// la patente es invalida cuando no cumple con los requisitos
		// no es necesario crear un auto porq el metodo es innecesario

		// String patente = "hdkjsaFJDKL";
		// Coche autito = new Coche(patente, "Volkswagen", "Golf GTI", 35000.0);

		// los espacios son caracteres
		String patente = "AF 234";
		assertTrue(concesionaria.patenteValida(patente));

	}

	@Test(expected = patenteNoExisteException.class)
	public void queAnteUnAutoInexistenteTermineConPatenteNoExisteException()
			throws patenteNoExisteException, patenteInvalida {
		Concesionaria concesionaria = new Concesionaria("No quiero mas");
		String patente = "JOBA 9180";
		// try {
		concesionaria.buscarPorPatente(patente);
		// } catch (patenteInvalida e) {
		// e.getMessage();
		// }
		// no es necesario utilizar el try-catch cuando usas un expected

	}

	@Test(expected = patenteNoExisteException.class)
	public void queNoSePuedaBuscarUnAutoPorPatenteSiLaPatenteNoExiste()
			throws patenteNoExisteException, patenteInvalida {
		Concesionaria c = new Concesionaria("why not me?");
		// c.agregarCoche(new Coche("..","22","sdsa",2.0));
		c.buscarPorPatente("fjdkls");
	}

	@Test
	public void testAEleccion() {
		Coche auto = new Coche("AF 546 HJ", "BMW", "M3", 130000.0);
		Coche auto2 = new Coche("AE 223 DG", "Volkswagen", "Scirocco", 35000.0);
		Coche auto3 = new Coche("AA 420 EG", "Mercedez", "A45", 65000.0);

		Map<String, Coche> coches = new HashMap<>();
		List<Coche> cochesMayorA10000 = new ArrayList<>();

		coches.put("A", auto);
		coches.put("B", auto2);
		coches.put("C", auto3);
		// map necesita una clave y un valor. se agrega con put de forma ordenada. el
		// for recorre ese mapa y si su precio es mayor a diez mil entonces agrego esos
		// coches mayores a 10000
		for (Coche coche : coches.values()) {
			if (coche.getPrecio() > 10000.0) {
				cochesMayorA10000.add(coche);
			}
		}
		// System.out.println();
		// assertEquals(coches.get("a"), m4);

	}
}
