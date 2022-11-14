package transportev2;

public class Motocicleta extends Vehiculo {

	// private Conductor[] chofer = new Conductor[1];

	public Motocicleta(Double cantKilometrosRecorridos, String chofer) {
		super(cantKilometrosRecorridos, chofer);
	}

	@Override
	public void agregarAcompañanteOPasajero(Pasajero acompañante) {
		getPasajeros().add(acompañante);

	}

	public void cambiarChofer(String choferNuevo) {
		if (getPasajeros() == null)
			setChofer(choferNuevo);
	}

}
