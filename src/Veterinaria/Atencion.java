package Veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Atencion {

	private Dueño duenio;
	private Mascota mascota;
	private Double precio;
	private Integer id;
	private List<Medicamento> medicamentos;

	public Atencion(Integer id, Dueño duenio, Mascota mascota, Double precio) {
		this.duenio = duenio;
		this.mascota = mascota;
		this.precio = precio;
		this.id = id;
		this.medicamentos = new ArrayList<>();
	}

	public Dueño getDuenio() {
		return duenio;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void agregarMedicamentoALaAtencion(Medicamento medicamento) {
		this.medicamentos.add(medicamento);
	}

	public void agregarVariosMedicamentos(Integer idAtencion, Integer idMedicamento) {

	}

	public Double getPrecioDeLaAtencion() {
		Double importe = this.precio;
		for (Medicamento medicamento : medicamentos) {
			importe += medicamento.getPrecio();
		}
		return importe;
	}

	public Integer cantidadDeMedicamentos() {

		return this.medicamentos.size();
	}

}
