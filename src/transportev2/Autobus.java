package transportev2;

import java.util.LinkedList;

public class Autobus extends Vehiculo {

	private LinkedList<Pasajero> pasajeros;
	private final Integer CANT_ASIENTOS = 3;

	public Autobus(Double cantKilometrosRecorridos, String chofer) {
		super(cantKilometrosRecorridos, chofer);
		this.pasajeros = new LinkedList<Pasajero>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cambiarChofer(String chofer) {
		if (getPasajeros().size() == 0) {// no se puede cambiar de chofer si hay pasajero
			setChofer(chofer);
			return chofer;
		}
		return null;

	}

	@Override
	public void agregarAcompañanteOPasajero(Pasajero pasajero) {
		if (getCantidadPasajeros() <= CANT_ASIENTOS)
			pasajeros.add(pasajero);

	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Integer getCantidadPasajeros() {
		return this.pasajeros.size();
	}

}
