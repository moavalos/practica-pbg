package transportes;

public class TransportePasajero extends MedioTransporte {

	private Integer cantidadPasajerosMaximos;

	public TransportePasajero(String patente, Integer cantidadPasajerosMaximos) {
		super(patente);
		this.cantidadPasajerosMaximos = cantidadPasajerosMaximos;
	}

	public Integer getCantidadPasajerosMaximos() {
		return cantidadPasajerosMaximos;
	}

	public void setCantidadPasajerosMaximos(Integer cantidadPasajerosMaximos) {
		this.cantidadPasajerosMaximos = cantidadPasajerosMaximos;
	}

}
