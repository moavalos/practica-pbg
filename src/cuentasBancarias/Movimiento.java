package cuentasBancarias;

public class Movimiento {

	private TipoDeMovimiento motivo;
	private Double monto;

	public Movimiento(TipoDeMovimiento motivo, Double monto) {
		this.motivo = motivo;
		this.monto = monto;
	}

	public TipoDeMovimiento getMotivo() {
		return motivo;
	}

	public void setMotivo(TipoDeMovimiento motivo) {
		this.motivo = motivo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

}