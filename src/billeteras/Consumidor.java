package billeteras;

import java.util.HashSet;

public class Consumidor {

	private String nombre;
	private Integer dni;
	private MedioDePago medioPagador;

	public Consumidor(String nombre, Integer dni, MedioDePago medioPagador) {
		this.nombre = nombre;
		this.dni = dni;
		this.medioPagador = medioPagador;
	}

	public void agregarMedioDePago(MedioDePago nuevoMP) {
		this.medioPagador.add(nuevoMP);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public MedioDePago getMedioPagador() {
		return medioPagador;
	}

	public void setMedioPagador(MedioDePago medioPagador) {
		this.medioPagador = medioPagador;
	}
}
