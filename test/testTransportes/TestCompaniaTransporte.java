package testTransportes;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

import transportes.CantidadPasajeroSobrepasadaException;
import transportes.CapacidadExcedidaException;
import transportes.Carga;
import transportes.Empresa;
import transportes.TransportePasajero;
import transportes.Viaje;
import transportes.MedioTransporte;
import transportes.Pasajero;
import transportes.TicketPasajero;
import transportes.TipoTicketInvalidoException;
import transportes.TransporteCarga;

public class TestCompaniaTransporte {

	@Test
	public void queSePuedaRegistrarUnViaje() {

		Empresa empresa = new Empresa("UnlamTravel");

		LocalDateTime salida = LocalDateTime.of(2023, 07, 20, 19, 00);
		LocalDateTime llegada = LocalDateTime.of(2023, 07, 21, 0, 30);
		String origen = "Buenos Aires";
		String destino = "Mardel Plata";
		String Patente = "ac111jr";

		Integer cantidadPasajerosMaximos = 50;
		MedioTransporte medioTransporte = new TransportePasajero(Patente, cantidadPasajerosMaximos);

		Viaje viaje = new Viaje(salida, llegada, origen, destino, medioTransporte);

		empresa.registrarViaje(viaje);

		Boolean valorObtenido = empresa.getViajes().containsValue(viaje);
		assertTrue(valorObtenido);

	}

	@Test
	public void queSePuedaRegistrarUnTicketDePasajeroAUnViaje() throws TipoTicketInvalidoException, CantidadPasajeroSobrepasadaException {

		Empresa empresa = new Empresa("UnlamTravel");

		LocalDateTime salida = LocalDateTime.of(2023, 07, 20, 19, 00);
		LocalDateTime llegada = LocalDateTime.of(2023, 07, 21, 0, 30);
		String origen = "Buenos Aires";
		String destino = "Mardel Plata";

		String Patente = "ac111jr";

		Integer cantidadPasajerosMaximos = 50;
		MedioTransporte medioTransporte = new TransportePasajero(Patente, cantidadPasajerosMaximos);

		Viaje viaje = new Viaje(salida, llegada, origen, destino, medioTransporte);

		empresa.registrarViaje(viaje);

		Integer numeroViaje = 1;
		Integer dni = 2222;
		String apellido = "perez";
		Pasajero pasajero = new Pasajero(dni, apellido);
		empresa.registrarTicketPasajero(numeroViaje, pasajero);
		
        assertTrue(empresa.getTickets().stream().anyMatch(ticket -> ticket instanceof TicketPasajero && ((TicketPasajero) ticket).getPasajero().equals(pasajero)));

	}

	@Test
	public void queAlRegistrarUnTicketDePasajeroAUnViajeConMedioDeTransporteDeCargaLanceUnaException() throws TipoTicketInvalidoException, CantidadPasajeroSobrepasadaException {

		Empresa empresa = new Empresa("UnlamTravel");

		LocalDateTime salida = LocalDateTime.of(2023, 07, 20, 19, 00);
		LocalDateTime llegada = LocalDateTime.of(2023, 07, 21, 0, 30);
		String origen = "Buenos Aires";
		String destino = "Mardel Plata";

		String Patente = "ac111jr";

		Double cargaMaxima = 50.0;
		MedioTransporte medioTransporte = new TransporteCarga(Patente, cargaMaxima);

		Viaje viaje = new Viaje(salida, llegada, origen, destino, medioTransporte);

		empresa.registrarViaje(viaje);

		Integer numeroViaje = 1;

		Integer dni = 2222;
		String apellido = "perez";
		Pasajero pasajero = new Pasajero(dni, apellido);
		empresa.registrarTicketPasajero(numeroViaje, pasajero);
		
        assertThrows(TipoTicketInvalidoException.class, () -> empresa.registrarTicketPasajero(numeroViaje, pasajero));

	}

	@Test
	public void queSePuedaRegistrarUnTicketDeCargaAUnViaje() throws TipoTicketInvalidoException, CapacidadExcedidaException {

		Empresa empresa = new Empresa("UnlamTravel");

		LocalDateTime salida = LocalDateTime.of(2023, 07, 20, 19, 00);
		LocalDateTime llegada = LocalDateTime.of(2023, 07, 21, 0, 30);
		String origen = "Buenos Aires";
		String destino = "Mardel Plata";

		String Patente = "ac111jr";

		Double cargaMaxima = 50.0;
		MedioTransporte medioTransporte = new TransporteCarga(Patente, cargaMaxima);

		Viaje viaje = new Viaje(salida, llegada, origen, destino, medioTransporte);

		Integer numeroViaje = 1;
		empresa.registrarTicketCarga(numeroViaje, new Carga(1, 10.0));
	
	}

	@Test
	public void queSePuedaRegistrarUnTicketMixtoAUnViaje() {

		// No modificar este test.
		Empresa empresa = new Empresa("UnlamTravel");

		LocalDateTime salida = LocalDateTime.of(2023, 07, 20, 19, 00);
		LocalDateTime llegada = LocalDateTime.of(2023, 07, 21, 0, 30);
		String origen = "Buenos Aires";
		String destino = "Mardel Plata";

		String Patente = "ac111jr";

		Double cargaMaxima = 50.0;

		Integer cantidadPasajerosMaximos = 50;

		MedioTransporte medioTransporte = new TransporteCarga(Patente, cantidadDePasajerosMaximos, cargaMaxima);

		Viaje viaje = new Viaje(salida, llegada, origen, destino, medioTransporte);

		empresa.registrarViaje(viaje);

		Integer numeroViaje = 1;
		Integer dni = 2222;
		String apellido = "perez";
		Pasajero pasajero = new Pasajero(dni, apellido);
		Carga carga = new Carga(1, 10.0);
		empresa.registrarTicketMixto(numeroViaje, pasajero, carga);

		// Completar Test

	}

	@Test
	public void queAlRegistrarUnticketYExcedalaCargaMaximaDelTransporteLanceUnaExceptionCapacidadExcedidaException() {
		// Desarrollar test
	}

	@Test
	public void queSePuedaObtenerUnaListaPasajeroDeUnViajeOrdenadoPorDNIDescendiente() {
		// Desarrollar test
		// Debe invcar el Metodo obtenerListaPasajeroOrdenadosPorDNIDescendiente(Integer
		// numeroViaje) y este retorna un Treeset <Pasajero>

		Empresa empresa = new Empresa("UnlamTravel");

	}

	@Test
	public void queSePuedaObtenerElTotalDeCargasTransportada() {
		// Desarrollar test

	}

}
