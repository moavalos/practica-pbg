package vuelo;

public class Vuelo {

	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6; // COLUMNAS
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;

	public Vuelo(String origen, String destino, int cantidadPasajero) {
		/*
		 * El constructor debe generar las acciones necesarias para garantizar el
		 * correcto funcionamiento de los objetos de la clase
		 */
		this.origen = origen;
		this.destino = destino;
		this.pasajeros = new Pasajero[cantidadPasajero];
		this.asientos = new Pasajero[CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del vuelo. Devuelve true
		 * si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i] == null) {
				pasajeros[i] = pasajero;
				return true;
			}

		}
		return false;
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				if (asientos[fila][columna] == null) {
					return true;
				}
			}
		}
		return false;
	}

	public Pasajero buscarPasajero(int dni) {
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo
		 * encuentra devuelve null.
		 */
		Pasajero pasajero = new Pasajero(dni);
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajero.getDni() == dni) {
				return pasajero;
			}
		}
		return null;
	}

	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		/*
		 * Asigna el asiento al pasajero recibido por parámetro. Devuelve true si lo
		 * pudo asignar o false en caso que el asiento no se encuentre disponible.
		 */
		for (int i = 0; i < asientos.length; i++) {
			if (verificarDisponibilidadAsiento(fila, columna)) {
				pasajero = asientos[fila][columna];
				return true;
			}
		}
		return false;
	}

	public void ordenarListaDePasajerosPorDNI() {
		/*
		 * Ordena la lista de pasajeros por DNI.
		 */
		Pasajero aux;
		for (int i = 0; i < pasajeros.length - 1; i++) {
            for (int j = 0; j < pasajeros.length - i - 1; j++) {                                                              
          //      if (pasajeros[j + 1] < pasajeros[j]) {
                    aux = pasajeros[j + 1];
                    pasajeros[j + 1] = pasajeros[j];
                    pasajeros[j] = aux;
                }
            }
        }
	

	public Pasajero[] getPasajeros() {
		ordenarListaDePasajerosPorDNI();
		return pasajeros;
	}

	public String toString() {
		/*
		 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se
		 * encuentra libre "L" u ocupado "O".
		 */
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				if (asientos[i][j] == null)
					return "L";
			}

		}
		return "O";
	}

}
