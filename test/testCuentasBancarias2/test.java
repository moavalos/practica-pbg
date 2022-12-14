package testCuentasBancarias2;

import org.junit.Assert;
import org.junit.Test;

import cuentasBancarias2.Banco;
import cuentasBancarias2.CajaDeAhorro;
import cuentasBancarias2.Cliente;
import cuentasBancarias2.Cuenta;
import cuentasBancarias2.CuentaInvalidaException;
import cuentasBancarias2.MontoInsuficienteException;
import cuentasBancarias2.MontoInvalidoException;

public class test {


	// Completar los métodos y las clases con la lógica necesaria para que
	// funcionen los tests,
	// y probarlos. En caso de que corresponda se deben agregar las excepciones
	// para informar
	// de los errores y probar que las mismas sean lanzadas correctamente, o
	// tratadas
	// (Los métodos que deben lanzar las excepciones se tienen arriba los
	// comentarios con los
	// nombres de las excepciones que deben lanzar)..
	@Test
	public void testQueagregaUnCajaDeAhorroAlBanco() {

		Cliente cliente1 = new Cliente("nombre1", "apellido2", 12345678);
		Cuenta c1 = new CajaDeAhorro("a123", cliente1, 100.0, 3);
		Banco b1 = new Banco();

		Boolean actual = true;

		try {
			actual = b1.agregarCuenta(c1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Assert.assertTrue(actual);

	}

	@Test
	public void testQueVericaQueUnaTranseferenciaSeaCorrecta() {

		Cliente cliente1 = new Cliente("nombre1", "apellido1", 12345678);
		Cliente cliente2 = new Cliente("nombre2", "apellido2", 12345679);
		Cuenta c1 = new CajaDeAhorro("a123", cliente1, 100.0, 3);
		Cuenta c2 = new CajaDeAhorro("b123", cliente2, 50.0, 3);
		Banco b1 = new Banco();

		b1.agregarCuenta(c1);
		b1.agregarCuenta(c2);

		Double esperado = 90.0;
		Double actual = c1.getSaldo();

		try {
			b1.transfer(10.0, "a123", "b123");
			actual = c1.getSaldo();
		} catch (MontoInvalidoException e2) {
			System.out.println(e2.getMessage());
		} catch (MontoInsuficienteException e3) {
			System.out.println(e3.getMessage());
		} catch (CuentaInvalidaException e4) {
			System.out.println(e4.getMessage());
		}

		Assert.assertEquals(esperado, actual);

	}

	@Test(expected = MontoInsuficienteException.class)
	public void testQueVericaQueUnaTransferecniaNoSePuedeRealizarPorFaltaDeFondos()
			throws MontoInvalidoException, MontoInsuficienteException, CuentaInvalidaException {
		Cliente cliente1 = new Cliente("nombre1", "apellido1", 12345678);
		Cliente cliente2 = new Cliente("nombre2", "apellido2", 12345679);
		Cuenta c1 = new CajaDeAhorro("a123", cliente1, 100.0, 3);
		Cuenta c2 = new CajaDeAhorro("b123", cliente2, 50.0, 3);
		Banco b1 = new Banco();

		b1.agregarCuenta(c1);
		b1.agregarCuenta(c2);

		b1.transfer(200.0, "a123", "b123");
	}

	@Test
	public void testQueBuscaUnaCuentaCorrecta() {
		Cliente cliente1 = new Cliente("nombre1", "apellido1", 12345678);
		Cliente cliente2 = new Cliente("nombre2", "apellido2", 12345679);
		Cuenta c1 = new CajaDeAhorro("a123", cliente1, 100.0, 3);
		Cuenta c2 = new CajaDeAhorro("b123", cliente2, 50.0, 3);
		Banco b1 = new Banco();

		b1.agregarCuenta(c1);
		b1.agregarCuenta(c2);

		Cuenta esperada = c1;
		try {
			b1.buscarCuentaPorCbu("a123");
		} catch (CuentaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		Assert.assertEquals(esperada, c1);

	}

	@Test
	public void testQueObtieneUnaListaDeCuentasCorrientes() {

		Cliente cliente1 = new Cliente("nombre1", "apellido1", 12345678);
		Cliente cliente2 = new Cliente("nombre2", "apellido2", 12345679);
		Cuenta c1 = new CajaDeAhorro("a123", cliente1, 100.0, 3);
		Cuenta c2 = new CajaDeAhorro("b123", cliente2, 50.0, 3);
		Banco b1 = new Banco();

		try {
			b1.obtenerListaCuentaCorriente();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
