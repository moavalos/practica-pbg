package testTransportev2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import transportev2.Autobus;
import transportev2.Automovil;
import transportev2.Motocicleta;
import transportev2.Pasajero;
import transportev2.Vehiculo;

public class test {

	@Test
	public void queSePuedaCrearUnaMotocicleta() {
		Double kilometros = 100.0;
		String chofer = "Juan";
		Vehiculo motocicleta = new Motocicleta(kilometros, chofer, null);
		assertEquals(kilometros, motocicleta.getCantKilometrosRecorridos());
		assertEquals(chofer, motocicleta.getChofer());
		// assertEquals(acompañante, motocicleta.);
	}

	@Test
	public void queSePuedaCrearUnAutobus() {
		Double kilometros = 2200.0;
		String chofer = "Susana";
		Vehiculo atb = new Autobus(kilometros, chofer);
		assertEquals(kilometros, atb.getCantKilometrosRecorridos());
		assertEquals(chofer, atb.getChofer());

	}

	@Test
	public void queSePuedaCrearUnAutomovil() {
		Double kilometros = 40000.0;
		Vehiculo am = new Automovil(kilometros, "Juana");
		assertEquals(kilometros, am.getCantKilometrosRecorridos());
		assertEquals("Juana", am.getChofer());

	}

	@Test
	public void queNoSePuedaCambiarDeChoferSiHayAcompañanteEnLaMoto() {
		Pasajero acompañante = new Pasajero();
		Motocicleta mtc = new Motocicleta(1200.0, "dsa", acompañante);

		// mtc.agregarAcompañanteOPasajero(acompañante);

		String choferNuevo = "Susana";

		assertEquals(choferNuevo, mtc.cambiarChofer(choferNuevo));

	}

	@Test
	public void queNoSePuedaCambiarDeChoferSiHayPasajeroEnAutobus() {
		String chofer = "fjkdlñ";
		Autobus atb = new Autobus(50000.0, chofer);
		
		Pasajero p = new Pasajero();
		//atb.agregarAcompañanteOPasajero(p);
		
		String choferNuevo = "kfgdlñs";
		
		assertEquals(choferNuevo, atb.cambiarChofer(choferNuevo));
	}

	@Test
	public void queSoloEntre1ChoferY3PasajerosEnAutomovil() {
		Automovil atm = new Automovil(150000.0, "pepe");
		Pasajero p1 = new Pasajero();
		Pasajero p2 = new Pasajero();
		Pasajero p3 = new Pasajero();
		Pasajero p4 = new Pasajero();
		
		atm.agregarAcompañanteOPasajero(p1);
		atm.agregarAcompañanteOPasajero(p2);
		atm.agregarAcompañanteOPasajero(p3);
		atm.agregarAcompañanteOPasajero(p4);
		
		Integer valorEsperado = 3;

		assertEquals(valorEsperado, atm.cantidadDePasajeros());

	}

	@Test
	public void queSePermitaSolo1ChoferY1AcompañanteEnMotocicleta() {

	}

	@Test
	public void queEnElAutobusSoloSePermitan20Pasajeros() { // solo uso 3 bue
		Autobus atb = new Autobus(1200.0, "Pepito");
		Pasajero p1 = new Pasajero();
		Pasajero p2 = new Pasajero();
		Pasajero p3 = new Pasajero();
		Pasajero p4 = new Pasajero();

		atb.agregarAcompañanteOPasajero(p1);
		atb.agregarAcompañanteOPasajero(p2);
		atb.agregarAcompañanteOPasajero(p3);
		atb.agregarAcompañanteOPasajero(p4); 
		// el p4 no lo agrega porque se permiten hasta 3 pasajeros

		Integer valorEsperado = 3;

		assertEquals(valorEsperado, atb.getCantidadPasajeros());

	}

}
