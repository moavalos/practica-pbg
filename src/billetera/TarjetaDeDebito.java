package billetera;

public class TarjetaDeDebito implements Pagadora {

	private Long numero;
	private String titular;
	private Integer codigoSeguridad;
	private String fechaVencimiento;
	private Double saldo;

	public TarjetaDeDebito(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad) {
		this.numero = numero;
		this.titular = titular;
		this.fechaVencimiento = fechaVencimiento;
		this.codigoSeguridad = codigoSeguridad;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Long getNumero() {
		return numero;
	}

	@Override
	public String getTitular() {
		return titular;
	}

	@Override
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	@Override
	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

}
