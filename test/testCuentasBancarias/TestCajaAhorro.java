package testCuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

import cuentasBancarias.CuentaAhorro;

public class TestCajaAhorro {

	@Test
	public void quePermiteReservarSaldo() {
		CuentaAhorro cuenta = dadoQueExisteCuenta();
		dadoQueDeposito(cuenta, 100.00);
		cuandoReservoSaldo(cuenta, 50.00);
		entoncesSuSaldoEs(cuenta, 50.00);
	}
	
	deposito
	extraer
	extraer
	extraer
	extraer
	extraer
	
	extraer
	se = 1394.0
	vo = cajaahorro.getsaldo
	assertequeals ve vo

	private void dadoQueDeposito(CuentaAhorro cuenta, Double monto) {
		cuenta.depositar(monto);
	}

	private void entoncesSuSaldoEs(CuentaAhorro cuenta, Double monto) {
		Assert.assertEquals(cuenta.getSaldo(), monto);
	}

	private CuentaAhorro dadoQueExisteCuenta() {
		return new CuentaAhorro(0.0);
	}

	private void cuandoReservoSaldo(CuentaAhorro cuenta, Double monto) {
		cuenta.reservar(monto);
	}
}
