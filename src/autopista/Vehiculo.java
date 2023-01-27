package autopista;

public class Vehiculo {

	private String Patente;
	private Integer velocidadActual;
	private Integer limiteVelocidad;

	public void incrmentarVelocidad(Integer velocidad) {
		if (velocidad < limiteVelocidad)
			velocidadActual++;
	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}

	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}

}
