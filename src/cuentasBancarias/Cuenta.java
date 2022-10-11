package cuentasBancarias;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class Cuenta {

	// private Integer idCuenta;
	// private Cliente cliente;
	protected Double saldo = 0.0;
	protected List<Movimiento> movimientos = new LinkedList<Movimiento>();

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void depositar(Double saldo) {
		if (saldo >= 0) {
			this.saldo = this.saldo + saldo;
			this.movimientos.add(new Movimiento(TipoDeMovimiento.DEPOSITO, saldo));
		}
	}

	public void extraer(Double saldo) {
		if (this.saldo >= saldo && saldo > 0) {
			this.saldo = this.saldo - saldo;
			this.movimientos.add(new Movimiento(TipoDeMovimiento.EXTRACCION, saldo));
		}
	}

	public void transferir(Cuenta cuentaDestino, Double saldo) {
		if (saldo >= 0 && saldo <= this.saldo) {
			this.saldo = this.saldo - saldo;
			cuentaDestino.depositar(saldo);
			this.movimientos.add(new Movimiento(TipoDeMovimiento.TRANSFERENCIA, saldo));
		}

	}

	public List<Movimiento> getDepositos() {
		List<Movimiento> depositos = new LinkedList<Movimiento>();
		for (Movimiento transaccion : this.movimientos) {
			if (transaccion.getMotivo().equals(TipoDeMovimiento.DEPOSITO)) {
				depositos.add(transaccion);
			}
		}

		return depositos;
	}
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((idCuenta == null) ? 0 : idCuenta.hashCode());
	 * return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Cuenta other = (Cuenta) obj; if (idCuenta == null) if (other.idCuenta
	 * != null) return false; else if (!idCuenta.equals(other.idCuenta)) return
	 * false; return true; }
	 */

}
