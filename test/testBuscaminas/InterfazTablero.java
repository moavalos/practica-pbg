package testBuscaminas;

import buscaminas.Tablero;

public class InterfazTablero {

	public static void main(String[] args) {

		Tablero tablero = new Tablero(5, 5, 5);
		tablero.imprimirTablero();
		System.out.println("--------");
		tablero.imprimirPistas();

	}

}
