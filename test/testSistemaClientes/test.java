package testSistemaClientes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sistemaClientes.Cliente;
import sistemaClientes.ClienteBandaAncha;
import sistemaClientes.ClienteCable;
import sistemaClientes.ClienteTelefonia;
import sistemaClientes.ClienteTri;
import sistemaClientes.Empresa;
import sistemaClientes.NoEsClienteConCableException;
import sistemaClientes.Premium;

public class test {
	@Test
	public void queSePuedaCrearUnClienteDeTelefonia() {
		ClienteTelefonia nuevo = new ClienteTelefonia(1000, "Juana", "11", "63598237");
		//System.out.println(nuevo.getCodigoDeArea());
		//System.out.println(nuevo.getTelefono());
		assertEquals(nuevo.getCodigoDeArea(), "11");
		assertEquals(nuevo.getTelefono(), "63598237");
	}

	@Test
	public void queSePuedaCrearUnClienteDeCable() {
		ClienteCable nuevo = new ClienteCable(1000, "Pepe", "46546546504637");
		assertEquals(nuevo.getCodigoDecodificador(), "46546546504637");
	}

	@Test
	public void queSePuedaCrearUnClienteDeBandaAncha() {
		ClienteBandaAncha nuevo = new ClienteBandaAncha(1000, "Susana", "susi@telecomunications.com");
		assertEquals(nuevo.getEMail(), "susi@telecomunications.com");

	}

	@Test
	public void queSePuedaCrearUnClienteTri() {
		ClienteTri nuevo = new ClienteTri(1000, "Susana", "11", "63598237", "46546546504637",
				"susi@telecomunications.com");

		assertEquals(nuevo.getCodigoDeArea(), "11");
		assertEquals(nuevo.getCodigoDecodificador(), "46546546504637");
		assertEquals(nuevo.getEMail(), "susi@telecomunications.com");
	}

	@Test
	public void queSePuedanIncorporarDistintosClientes() {
		Empresa actual = new Empresa("Telecomunications");
		actual.agregarCliente(new ClienteTelefonia(1000, "Amanda", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteCable(1002, "Jorge", "46546546777788"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(
				new ClienteTri(1004, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteBandaAncha(1007, "Luciana", "luciana@telecomunications.com"));
		actual.agregarCliente(new ClienteBandaAncha(1008, "Luna", "luna@telecomunications.com"));
		actual.agregarCliente(
				new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com"));
		actual.agregarCliente(new ClienteTelefonia(1004, "Tamara", "11", "63598967"));

		assertEquals((Integer) 10, actual.getCantidadAbonados());

	}

	@Test
	public void queUnClienteDeCablePuedaHabilitarElCodificado() throws NoEsClienteConCableException {
		Cliente celeste = new ClienteCable(999, "Celeste", "4666666777788");
		Empresa actual = new Empresa("Telecomunications");

		actual.agregarCliente(new ClienteTelefonia(1000, "Camila", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteCable(1002, "Jorge", "46546546777788"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(
				new ClienteTri(1004, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteBandaAncha(1007, "Luciana", "luciana@telecomunications.com"));
		actual.agregarCliente(new ClienteBandaAncha(1008, "Luna", "luna@telecomunications.com"));
		actual.agregarCliente(
				new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com"));
		actual.agregarCliente(new ClienteTelefonia(1004, "Tamara", "11", "63598967"));

		assertTrue(actual.habilitarPremium(Premium.FUTBOL, celeste));

	}
}
