package transporte;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

	protected String nombreChofer;
	protected Double kmRecorridos;
	protected List<String> pasajeros;

	public Vehiculo(String nombreChofer, Double kmRecorridos) {
		this.nombreChofer = nombreChofer;
		this.kmRecorridos = kmRecorridos;
		this.pasajeros = new ArrayList<String>();
	}

	public void agregarKmRecorridos(Double kms) {
		this.kmRecorridos = this.kmRecorridos + kms;
	}

	public Boolean asignarChofer(String chofer) {
		this.nombreChofer = chofer;
		return true;
	}

	public Boolean bajarChofer(String chofer) {
		this.nombreChofer = chofer;
		return true;
	}

	public Boolean agregarAcompaniante(List<String> nombreAcompaniante) {
		this.pasajeros = nombreAcompaniante;
		return false;
	}

	public Boolean agregarPasajero(String nombrePasajero) {
		if (pasajeros.size() < 20) {
			this.pasajeros.add(nombrePasajero);
			return true;
		}
		return false;
	}

	public void bajarPasajeros() {
		this.pasajeros.clear();
	}

	public void bajarAcompaniante() {
		this.pasajeros = null;
	}

	public Boolean cambiarChofer(String chofer) {
		if (this.pasajeros.size() == 0) {
			this.nombreChofer = chofer;
			return true;
		}
		return false;
	}
}
