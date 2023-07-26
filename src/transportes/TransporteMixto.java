package transportes;

public class TransporteMixto extends MedioTransporte{
	
	private Integer cantidadPasajerosMaximos;
	private Double cargaMaxima;

	public TransporteMixto(String patente) {
		super(patente);
	}

	public Integer getCantidadPasajerosMaximos() {
		return cantidadPasajerosMaximos;
	}

	public void setCantidadPasajerosMaximos(Integer cantidadPasajerosMaximos) {
		this.cantidadPasajerosMaximos = cantidadPasajerosMaximos;
	}

	public Double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

}
