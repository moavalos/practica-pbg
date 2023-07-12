package futsal;

import java.util.ArrayList;

public class EquipoDeFutbol {
	private String nombre;
	private ArrayList<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<Jugador>();
	}

	/*
	 * La capacidad m�xima de un equipo es 5. No se permiten jugadores repetidos (ya
	 * sea el n�mero o nombre del jugador) Se retorna el resultado de la operaci�n
	 */
	public boolean agregarJugador(Jugador nuevo) {
		if(jugadores.size() < 5 
				&& jugadores.get(0).getNumero() == nuevo.getNumero() 
				&& jugadores.get(0).getNombre().equals(nuevo.getNombre())) {
			jugadores.add(nuevo);
			return true;
		}
		return false;
	}

	/*
	 * Permite buscar un jugador por su numero.
	 * 
	 */
	public Jugador buscar(int numero) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNumero() == numero) {
				return jugador;
			}
		}
		return null;
	}

	/*
	 * Permite buscar un jugador por su nombre.
	 * 
	 */
	public Jugador buscar(String nombre) {
		for (Jugador jugador : jugadores) {
			if(jugador.getNombre().equals(nombre))
				return jugador;
		}
		return null;
	}

	/*
	 * Calcula el valor del equipo.
	 * 
	 */
	public double calcularLaEdadPromedioDelEquipo() {
		Integer edadJugadores =+ jugadores.get(0).getEdad();
		Integer cantidadJugadores = jugadores.size();
		Integer promedio = edadJugadores / cantidadJugadores;
		return promedio;
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
