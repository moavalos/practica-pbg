package transporte;

public class Moto extends Vehiculo {

	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS = 2;
	private String patente;
	private Integer velocidadMaxima;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
		this.setLongitud(longitud);
		this.setLatitud(latitud);

	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public String getPatente() {
		return patente;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

}
