package transportev2;

import java.util.LinkedList;

public class Motocicleta extends Vehiculo {

	// private Conductor[] chofer = new Conductor[1];
	// private LinkedList<Pasajero> pasajeros;
	private Pasajero acompañante;

	public Motocicleta(Double cantKilometrosRecorridos, String chofer, Pasajero acompañante) {
		super(cantKilometrosRecorridos, chofer);
		this.acompañante = acompañante;
		// this.pasajeros = new LinkedList<Pasajero>();
	}

	@Override
	public void agregarAcompañanteOPasajero(Pasajero acompañante) {
	}

	public String cambiarChofer(String choferNuevo) {
		if (getAcompañante() == null) {
			setChofer(choferNuevo);
			return choferNuevo;
		}
		return null;
	}

	public Pasajero getAcompañante() {
		return acompañante;
	}

	public void setAcompañante(Pasajero acompañante) {
		this.acompañante = acompañante;
	}

}
