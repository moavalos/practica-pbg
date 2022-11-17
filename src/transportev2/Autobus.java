package transportev2;

import java.util.LinkedList;

public class Autobus extends Vehiculo {

	private LinkedList<Pasajero> pasajeros;

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
		// tienen q ser hasta 20 pasajeros pero mucho entraste
		if (getCantidadPasajeros() < 3) {
			pasajeros.add(pasajero);
		}

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
