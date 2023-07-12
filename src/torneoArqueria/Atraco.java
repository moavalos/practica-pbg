package torneoArqueria;

public class Atraco {

	private Vigilante vigilante;
	private Atracador atracador;
	private Banco banco;

	public Atraco(Atracador atracador, Banco banco) {
		this.atracador = atracador;
		this.banco = banco;
	}

	public Atracador getAtracador() {
		return atracador;
	}

	public void setAtracador(Atracador atracador) {
		this.atracador = atracador;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Vigilante getVigilante() {
		return vigilante;
	}
}
