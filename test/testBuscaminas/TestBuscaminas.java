package testBuscaminas;

import org.junit.Test;

import buscaminas.Tablero;

public class TestBuscaminas {
	
	@Test
	public static void queSePuedaCrearUnTablero() {
		Tablero tablero = new Tablero(4, 4, 2);
	}

}
