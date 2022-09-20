package futsal;


public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * La capacidad m�xima de un equipo es 5. No se permiten jugadores repetidos (ya
	 * sea el n�mero o nombre del jugador) Se retorna el resultado de la operaci�n
	 */
	public boolean agregarJugador(Jugador nuevo) {
		Jugador jugador;
		/*if(jugadores.length < 5 && nuevo.getNumero() != jugador.getNumero() && nuevo.getNombre() != jugador.getNombre()) {
			
		}*/
		return false;
	}

	/*
	 * Permite buscar un jugador por su numero.
	 * 
	 */
	public Jugador buscar(int numero) {
		return null;
	}

	/*
	 * Permite buscar un jugador por su nombre.
	 * 
	 */
	public Jugador buscar(String nombre) {
		return null;
	}

	/*
	 * Calcula el valor del equipo.
	 * 
	 */
	public double calcularLaEdadPromedioDelEquipo() {
		return 0.0;
	}

	/*
	 * Calcula el valor del equipo
	 * 
	 */
	public double calcularElValorDelEquipo() {
		return 0.0;
	}

	public String toString() {
		return this.nombre;
	}

}
