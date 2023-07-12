package eventos;

public class Cumple extends Evento {

	private Agasajado agasajado;

	public Cumple(Agasajado agasajado) {
		super(agasajado);
		this.agasajado = agasajado;
	}

	public Agasajado getAgasajado() {
		return agasajado;
	}

}