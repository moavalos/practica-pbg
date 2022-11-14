package testTransportev2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import transportev2.Motocicleta;
import transportev2.Vehiculo;

public class test {
	
	@Test
	public void queSePuedaCrearUnaMotocicleta() {
		Double kilometros = 100.0;
		String chofer = "Juan";
		Vehiculo motocicleta = new Motocicleta(kilometros, chofer);
		assertEquals(kilometros, motocicleta.getCantKilometrosRecorridos());
		assertEquals(chofer, motocicleta.getChofer());
	}
	
	@Test
	public void queSePuedaCrearUnAutobus() {
		
	}
	
	@Test
	public void queSePuedaCrearUnAutomovil() {
		
	}
	
	@Test
	public void queNoSePuedaCambiarDeChoferSiHayAcompañanteEnLaMoto() {
		
	}
	
	@Test
	public void queNoSePuedaCambiarDeChoferSiHayPasajeroEnAutobus() {
		
	}
	
	@Test
	public void queSoloEntre1ChoferY3PasajerosEnAutomovil() {
		
	}
	
	@Test
	public void queSePermitaSolo1ChoferY1AcompañanteEnMotocicleta() {
		
	}

}
