package buscaminas;

public class Casilla {

	private Integer posicionFila;
	private Integer posicionColumna;
	private Boolean mina;
	private int numeroMinasAlrededor;
	private Boolean abierta;

	public Casilla(Integer posicionFila, Integer posicionColumna, Boolean mina) {
		this.posicionFila = posicionFila;
		this.posicionColumna = posicionColumna;
		this.mina = mina;
	}

	public void incrementarMinasAlrededor() {
		this.numeroMinasAlrededor++;
	}

	public Integer getPosicionFila() {
		return posicionFila;
	}

	public void setPosicionFila(Integer posicionFila) {
		this.posicionFila = posicionFila;
	}

	public Integer getPosicionColumna() {
		return posicionColumna;
	}

	public void setPosicionColumna(Integer posicionColumna) {
		this.posicionColumna = posicionColumna;
	}

	public Boolean getMina() {
		return mina;
	}

	public void setMina(Boolean mina) {
		this.mina = mina;
	}

	public Integer getNumeroMinasAlrededor() {
		return numeroMinasAlrededor;
	}

	public void setNumeroMinasAlrededor(Integer numeroMinasAlrededor) {
		this.numeroMinasAlrededor = numeroMinasAlrededor;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

}
