package billeteras;

public class TarjetaDeDebito implements Transferible {
	private Long numeroTarjeta;
	private String nombreTitular;
	private Integer codigoSeguridad;
	private String fechaVencimiento;
	private Double saldo;

	// Constructor
	public TarjetaDeDebito(Long numeroTarjeta, String nombreTitular, Integer codigoSeguridad, String fechaVencimiento,
			Double saldo) {
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.codigoSeguridad = codigoSeguridad;
		this.fechaVencimiento = fechaVencimiento;
		this.saldo = saldo;
	}

	public TarjetaDeDebito(Long nUMERO_ESPERADO, String tITULAR_ESPERADO, String fECHA_DE_VENCIMIENTO_ESPERADO,
			Integer cODIGO_DE_SEGURIDAD_ESPERADO) {
		// TODO Auto-generated constructor stub
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

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Boolean transferir() {
		// TODO Auto-generated method stub
		return null;
	}

}
