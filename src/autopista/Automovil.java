package autopista;

public class Automovil extends Vehiculo implements Imultable {

	private final Integer limiteVelocidad = 130;

	public Automovil() {
		setLimiteVelocidad(limiteVelocidad);
	}

	@Override
	public Boolean enInfraccion() {
		if (getVelocidadActual() > getLimiteVelocidad())
			return true;
		return false;
	}
}
