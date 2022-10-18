package testSistemaBar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import SistemaBar.Bar;
import SistemaBar.Persona;

public class test {


	@Test
	public void queNoSeAdmitanDuplicados() {
		Bar barcito = new Bar();
		Persona persona1 = new Persona("Juanchis");
		Persona persona2 = new Persona("Juanchis");
		barcito.agregarCliente(persona1);
		barcito.agregarCliente(persona2);
		Integer valorEsperado = 1;
		Integer valorObtenido = barcito.obtenerCantidadDeClientes();
		assertEquals(valorEsperado, valorObtenido);
		//assertEquals(1, barcito.obtenerCantidadDeClientes());
		
	}
	
	@Test 
	public void queSeAdmitanDistintos() {
		Bar barcote = new Bar();
		Persona p1 = new Persona("Marta");
		Persona p2 = new Persona("Agustin");
		barcote.agregarCliente(p1);
		barcote.agregarCliente(p2);
		Integer valorEsperado = 2;
		assertEquals(valorEsperado, barcote.obtenerCantidadDeClientes());
	}
	
	@Test
	public void queEstenOrdenados() {
		Bar bar = new Bar();
		Persona personaUno = new Persona("ganas de jugar counter me sobran");
		Persona personaDos = new Persona("poppy te amo");
		bar.agregarCliente(personaUno);
		bar.agregarCliente(personaDos);
		
		String valorEsperado = "ganas de jugar counter me sobran";
		Persona valorObtenido = bar.obtenerClientes().first(); 
		// el metodo first() devuelve el primero de los elementos de un TreeSet.
		// el primer elemento es el mas bajo o peque�o (Integer) de los elementos del conjunto
		assertEquals(valorEsperado, valorObtenido.getNombre());
	}
}
