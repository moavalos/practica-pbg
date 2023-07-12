package eventos;

public class Cumple extends Evento {

	private Agasajado agasajado;

	public Cumple(Agasajado agasajado) {
		super("El cumple de " + agasajado.getNombre());
		this.agasajado = agasajado;
	}

	public Agasajado getAgasajado() {
		return agasajado;
	}

}