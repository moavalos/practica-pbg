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
	public void cambiarChofer(String chofer) {
		if (getPasajeros() == null) // no se puede cambiar de chofer si hay pasajero
			setChofer(chofer);
	}

	@Override
	public void agregarAcompañanteOPasajero(Pasajero pasajero) {
		if (getPasajeros().size() <= CANT_ASIENTOS)
			pasajeros.add(pasajero);

	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Integer getCantidadPasajeros() {
		// TODO Auto-generated method stub
		return this.pasajeros.size();
	}

}
