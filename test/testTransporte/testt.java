package testTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

import transporte.Automovil;
import transporte.Motocicleta;
import transporte.Vehiculo;

public class testt {

	@Test
	public void queSePuedaAgregarAcompanianteEnUnaMotocicleta() {
		String nombreAcompaniante = "Karen";
		Vehiculo miMotocicleta = new Motocicleta(nombreAcompaniante, null);
		miMotocicleta.agregarAcompaniante(nombreAcompaniante);
		assertTrue(nombreAcompaniante.equals(miMotocicleta.getAcompaniante()));
	}
	
	@Test
	public void queSePuedaSubirTresPasajerosEnUnAutomovil() {
		String pasajero1 = "Maria";
		String pasajero2 = "Juana";
		String pasajero3 = "Jose";
		Vehiculo miAutomovil = new Automovil();
		miAutomovil.agregarPasajero(pasajero1);
		miAutomovil.agregarPasajero(pasajero2);
		miAutomovil.agregarPasajero(pasajero3);
		assertEquals(miAutomovil.getPasajeros().size(),3);
	}
	
	@Test
	public void queNoSePuedaCambiarDeChoferEnUnAutobusPorqueTienePasajeros() {
		String unPasajero = "Martin";
		Vehiculo miAutobus = new Autobus();
		miAutobus.agregarPasajero(unPasajero);
		Boolean resultadoEsperado = false;
		Boolean resultadoObtenido = miAutobus.cambiarChofer("Luis");
		Assert.assertFalse(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	public void queSePuedaCambiarDeChoferEnUnAutomovil() {
		Vehiculo otroAutomovil = new Automovil("Luis",25.2);
		String nuevoChofer = "Josefina";
		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido = otroAutomovil.cambiarChofer(nuevoChofer);
		Assert.assertTrue(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	public void queNoSePuedaCambiarDeChoferEnUnaMotocicleta() {
		String otroAcompaniante = "Mirta";
		Vehiculo otraMotocicleta = new Motocicleta("Franco",35.9);
		otraMotocicleta.agregarAcompaniante(otroAcompaniante);
		Boolean resultadoEsperado = false;
		Boolean resultadoObtenido = otraMotocicleta.cambiarChofer("Ludmila");
		Assert.assertFalse(resultadoEsperado,resultadoObtenido);
	}

}
