package transportev2;

import java.util.LinkedList;

public class Automovil extends Vehiculo {

	private LinkedList<Pasajero> pasajeros;

	public Automovil(Double cantKilometrosRecorridos, String chofer) {
		super(cantKilometrosRecorridos, chofer);
		this.pasajeros = new LinkedList<Pasajero>();
	}

	@Override
	public String cambiarChofer(String chofer) {
		setChofer(chofer);
		return chofer;

	}

	@Override
	public void agregarAcompañanteOPasajero(Pasajero pasajero) {
		if (cantidadDePasajeros() < 3) {
			pasajeros.add(pasajero);
		}

	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Integer cantidadDePasajeros() {
		return this.pasajeros.size();
	}

}
