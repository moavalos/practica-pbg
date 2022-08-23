package cineTest;

import java.util.Scanner;

import cine.SalaDeCine;

public class SalaDeCineTest {

	//final static Integer BUTACA_OCUPADA = 1, OCUPAR_BUTACA = 2, CANTIDAD_BUTACAS_OCUPADAS = 3, HAY_ESPACIO_PARA = 4;
	
	public static void main(String[] args) {

		System.out.println("Bienvenido a Hoyts. Elige la opción deseada");
		System.out.println("Por defecto, las columnas del cine son 14 y las filas 15.\nLas butacas están compuestas por numero de columna y fila.");
		Scanner teclado = new Scanner(System.in);
		Integer opcionDeseada;
		SalaDeCine sala = new SalaDeCine();

		do {
			System.out.println(" ");
			System.out.println("Menú de opciones.");
			System.out.println("1 - Ver cual butaca esta ocupada o disponible");
			System.out.println("2 - Ocupar una butaca");
			System.out.println("3 - Ver la cantidad totales de butacas disponibles");
			System.out.println("4 - Ver cuanto espacio hay para determinado grupo de personas");

			opcionDeseada = teclado.nextInt();

			switch (opcionDeseada) {
			case 1:
				butacaOcupada(sala, teclado);
				break;
			case 2:
				ocuparButaca(sala, teclado);
				break;
			case 3:
				cantidadButacasOcupadas();
				break;
			case 4:
				hayEspacioPara();
				break;
			default:
				System.err.println("error");
				break;
			}

		} while (opcionDeseada != 4);
	}

	private static void butacaOcupada(SalaDeCine sala, Scanner teclado) {
		System.out.println("Ingrese el numero de columna");
		Integer nroColumna = teclado.nextInt();
		System.out.println("Ingrese el numero de fila");
		Integer nroFila = teclado.nextInt();
		
		System.out.println("La butaca " + nroColumna + nroFila + " esta disponible? " + sala.butacaOcupada(nroColumna, nroFila));

	}

	private static void ocuparButaca(SalaDeCine sala, Scanner teclado) {
		System.out.println("Ingrese el numero de columna");
		Integer nroColumna = teclado.nextInt();
		System.out.println("Ingrese el numero de fila");
		Integer nroFila = teclado.nextInt();
		
		if(sala.ocuparButacaPrueba(nroColumna, nroFila)) {
			System.out.println("La butaca que eligió la ocupó con exito");
		}

	}

	private static void cantidadButacasOcupadas() {

	}

	private static void hayEspacioPara() {
		// aca pedir la cantidad de personas e informar que fila se encuentra disponible para esa cantidad de personas
	}

}
