package billeteras;

public class Compra {
	private Long cuitComercio;
	private Double importe;
	private Boolean compraSaldada;

	public Compra(Long cuitComercio, Double importe) {
		this.cuitComercio = cuitComercio;
		this.importe = importe;
	}

	public Long getCuitComercio() {
		return cuitComercio;
	}

	public void setCuitComercio(Long cuitComercio) {
		this.cuitComercio = cuitComercio;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Boolean getCompraSaldada() {
		return compraSaldada;
	}

	public void setCompraSaldada(Boolean compraSaldada) {
		this.compraSaldada = compraSaldada;
	}
}
