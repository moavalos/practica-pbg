package transportev2;

import java.util.LinkedList;

public abstract class Vehiculo {

	private Double cantKilometrosRecorridos;
	//private Conductor[] chofer; // o conductor
	private String chofer;

	public Vehiculo(Double cantKilometrosRecorridos, String chofer) {
		this.cantKilometrosRecorridos = cantKilometrosRecorridos;
		this.chofer = chofer;
	}
	
	//public abstract void asignarChofer(String chofer); ya lo tiene asignado bue
	
	public abstract String cambiarChofer(String chofer);
	
	public abstract void agregarAcompañanteOPasajero(Pasajero pasajero);

	public Double getCantKilometrosRecorridos() {
		return cantKilometrosRecorridos;
	}

	public void setCantKilometrosRecorridos(Double cantKilometrosRecorridos) {
		this.cantKilometrosRecorridos = cantKilometrosRecorridos;
	}

	public String getChofer() {
		return chofer;
	}

	public void setChofer(String chofer) {
		this.chofer = chofer;
	}
	
	

}
