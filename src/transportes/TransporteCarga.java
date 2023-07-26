package transportes;

public class TransporteCarga extends MedioTransporte implements iCargable {

	private Double cargaMaxima;

	public TransporteCarga(String patente, Double cargaMaxima) {
		super(patente);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public Integer obtenerCantidadMaximaPasajero() {
		return null;
	}

	public Double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

}
