package billeteras;

public class TarjetaDeCredito implements Pagadora {
	private Long numeroTarjeta;
	private String nombreTitular;
	private Integer codigoSeguridad;
	private String fechaVencimiento;
	private Double limiteCompraPesos;
	private Double limiteCompraDolares;

	// Constructor
	public TarjetaDeCredito(Long numeroTarjeta, String nombreTitular, Integer codigoSeguridad, String fechaVencimiento,
			Double limiteCompraPesos, Double limiteCompraDolares) {
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.codigoSeguridad = codigoSeguridad;
		this.fechaVencimiento = fechaVencimiento;
		this.limiteCompraPesos = limiteCompraPesos;
		this.limiteCompraDolares = limiteCompraDolares;
	}

	// Setter y Getter
	public Long getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Double getLimiteCompraPesos() {
		return limiteCompraPesos;
	}

	public void setLimiteCompraPesos(Double limiteCompraPesos) {
		this.limiteCompraPesos = limiteCompraPesos;
	}

	public Double getLimiteCompraDolares() {
		return limiteCompraDolares;
	}

	public void setLimiteCompraDolares(Double limiteCompraDolares) {
		this.limiteCompraDolares = limiteCompraDolares;
	}

	@Override
	public Boolean pagar() {
		// TODO Auto-generated method stub
		return null;
	}
}
