package testTransporte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import transporte.Auto;
import transporte.Bicicleta;
import transporte.ColitionException;
import transporte.Mapa;
import transporte.Moto;
import transporte.Tren;
import transporte.Vehiculo;

public class testing {
	@Test
	public void queSePuedaCrearUnAuto() {
		Auto nuevo = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		assertEquals("JJZ526", nuevo.getPatente());
		assertEquals((Integer) 5, nuevo.getCantidadMaximaDePasajeros());
		assertEquals((Integer) 240, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}

	@Test
	public void queSePuedaCrearUnaMoto() {
		Moto nuevo = new Moto("094AB5", 200, 41.40338, 2.17403);
		assertEquals("094AB5", nuevo.getPatente());
		assertEquals((Integer) 2, nuevo.getCANTIDAD_MAXIMA_DE_PASAJEROS());
		assertEquals((Integer) 200, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}

	@Test
	public void queSePuedaCrearUnaBicicleta() {
		Bicicleta nuevo = new Bicicleta(41.40338, 2.17403);
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());

	}

	@Test
	public void queSePuedaCrearUnTren() {
		Tren nuevo = new Tren(15, 250, 100, 41.40338, 2.17403);
		assertEquals((Integer) 15, nuevo.getCantidadDeVagones());
		assertEquals((Integer) 250, nuevo.getCantidadDePasajerosPorVagon());
		assertEquals((Integer) 100, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());

	}

	@Test
	public void queSePuedaIncorporarDistintosVehiculos() throws ColitionException {
		Mapa mapaActual = new Mapa("Buenos Aires");
		mapaActual.agregarVehiculo(new Auto("JJZ526", 5, 240, 10.40338, 1.17403));
		mapaActual.agregarVehiculo(new Moto("094AB5", 200, 50.40338, 2.5656));
		mapaActual.agregarVehiculo(new Auto("AAA001", 5, 100, 25.40338, 5.17403));
		mapaActual.agregarVehiculo(new Bicicleta(33.333, 8.12345));
		mapaActual.agregarVehiculo(new Auto("PPP333", 5, 240, 85.40338, 1.17403));
		mapaActual.agregarVehiculo(new Bicicleta(22.63258, 3.96542));
		mapaActual.agregarVehiculo(new Bicicleta(31.987452, 3.965482));
		mapaActual.agregarVehiculo(new Moto("088BB5", 100, 36.85421, 8.17403));
		mapaActual.agregarVehiculo(new Moto("094GG5", 90, 29.965482, 4.632152));
		mapaActual.agregarVehiculo(new Tren(15, 250, 100, 45.826541, 3.965412));
		
		assertEquals((Integer) 10, mapaActual.getCantidadDeVehiculos());
		assertFalse(mapaActual.hayCoalicion());

	}
	
	@Test(expected = ColitionException.class)
	public void queSeChoquenDosVehiculos() throws ColitionException { // LUCAS SI LEES ESTO TENES RAZON ES MUY DIVERTIDO
		Vehiculo autito = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		Vehiculo motito = new Moto("094AB5", 200, 25.1234, 1.1234);
		
		Mapa mapaActual = new Mapa("Buenos Aires");
		mapaActual.agregarVehiculo(autito);
		mapaActual.agregarVehiculo(motito);
		
		autito.actualizarCoordenadas(25.1234, 1.1234);
		
		assertTrue(mapaActual.hayCoalicion());
	}
}
