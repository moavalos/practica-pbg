package transporte;

public class Auto extends Vehiculo {

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.setLongitud(longitud);
		this.setLatitud(latitud);
	}

	public String getPatente() {
		return patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

}
