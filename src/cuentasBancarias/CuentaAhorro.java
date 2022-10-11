package cuentasBancarias;

public class CuentaAhorro extends Cuenta {

	/*
	 * Similar a la anterior, pero se pide que luego de la quinta extracción de
	 * dinero se cobre un costo adicional por extracción de $ 6
	 */

	private Double reserva = 0.0;

	public CuentaAhorro(Double reserva) {
		super(0.0);
		this.reserva = reserva;
	}

	public void reservar(Double monto) {
		reserva = monto;
		saldo = saldo - monto;
	}

	public Double getSaldo() {
		return saldo;
	}

	// Cuando deseo invocar el comportamiento del metodo sobreescrito.
	@Override
	public void depositar(Double monto) {
		this.saldo = this.saldo + monto;

	}

}
