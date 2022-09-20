package testBuscaminas;

import org.junit.jupiter.api.Test;

import buscaminas.Tablero;

public class TestBuscaminas {
	
	@Test
	public static void queSePuedaCrearUnTablero() {
		Tablero tablero = new Tablero(4, 4, 2);
	}

}
