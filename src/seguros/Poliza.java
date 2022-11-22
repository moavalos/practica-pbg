package seguros;

public abstract class Poliza {
	private Integer nroPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Double premio;
	private Boolean tuvoAccidentes;
	private Boolean sufrioRobos;

	public Poliza(Integer nroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.nroPoliza = nroPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.tuvoAccidentes = false;
		this.sufrioRobos = false;
	}

	public Boolean tuvoAlgunAccidente() {
		return this.tuvoAccidentes;
	}

	public Boolean fueRobado() {
		return this.sufrioRobos;
	}

	protected abstract void setTuvoAccidentes(boolean b);

	public Integer getNroPoliza() {
		return nroPoliza;
	}

	public void setNroPoliza(Integer nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}

	public Double getPremio() {
		return premio;
	}

	public void setPremio(Double premio) {
		this.premio = premio;
	}

	public Boolean getTuvoAccidentes() {
		return tuvoAccidentes;
	}

	public void setTuvoAccidentes(Boolean tuvoAccidentes) {
		this.tuvoAccidentes = tuvoAccidentes;
	}

	public Boolean getSufrioRobos() {
		return sufrioRobos;
	}

	public void setSufrioRobos(Boolean sufrioRobos) {
		this.sufrioRobos = sufrioRobos;
	}

	public Double calcularPremio(Double prima) {
		Double impuestos = 0.21;
		Double premio = prima + prima * impuestos;
		return premio;
	}
}
