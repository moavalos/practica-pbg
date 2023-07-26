package billetera;

public class TarjetaDeCredito extends TarjetaDeDebito {
	
	private Double limiteCompraDolares;
	private Double limiteCompraPesos;
	
	public TarjetaDeCredito(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad, Double limiteCompraPesos, Double limiteCompraDolares) {
		super(numero, titular, fechaVencimiento, codigoSeguridad);
	}

	public Double getLimiteCompraDolares() {
		return limiteCompraDolares;
	}

	public void setLimiteCompraDolares(Double limiteCompraDolares) {
		this.limiteCompraDolares = limiteCompraDolares;
	}

	public Double getLimiteCompraPesos() {
		return limiteCompraPesos;
	}

	public void setLimiteCompraPesos(Double limiteCompraPesos) {
		this.limiteCompraPesos = limiteCompraPesos;
	}

}
