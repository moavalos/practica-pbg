package transporte;

public class Tren extends Vehiculo {

	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;
	private Integer cantidadDeVagones;

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		//super();
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;
		this.cantidadDeVagones = cantidadDeVagones;
		this.setLongitud(longitud);
		this.setLatitud(latitud);
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

}
