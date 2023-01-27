package autopista;

public class Camion extends Vehiculo implements Imultable {

	private Integer cantidadDeEjes;
	private final Integer limiteVelocidad = 80;

	public Camion() {
		setLimiteVelocidad(limiteVelocidad);
	}

	@Override
	public Boolean enInfraccion() {
		if (getVelocidadActual() > getLimiteVelocidad())
			return true;
		return false;
	}
}
