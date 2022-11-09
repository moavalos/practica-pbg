package testSistemaDeportistas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import sistemaDeportistas.Ciclista;
import sistemaDeportistas.Club;
import sistemaDeportistas.Corredor;
import sistemaDeportistas.Deportista;
import sistemaDeportistas.INadador;
import sistemaDeportistas.NoEstaPreparado;
import sistemaDeportistas.TipoDeBicicleta;
import sistemaDeportistas.TipoDeEvento;
import sistemaDeportistas.Triatleta;

public class tets {
	@Test
	public void queSePuedaCrearUnNadador() {
		INadador nuevo = new INadador(1, "Camila", "Espalda");

		assertEquals("Espalda", nuevo.getEstiloPreferido());
		assertEquals((Integer)1, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor(2, "Carolina", 10000);
		nuevo.setCantidadDeKilometrosEntrenados(50000);
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals((Integer)50000, nuevo.getCantidadDeKilometrosEntrenados());
		assertEquals((Integer)2, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);

		assertEquals(TipoDeBicicleta.RUTA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer) 3, nuevo.getNumeroDeSocio());
	}

	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Triatleta nuevo = new Triatleta(4, "Luna", "Olimpico", TipoDeBicicleta.TRIA);
		
		assertEquals("Olimpico", nuevo.getDistanciaPreferida());
		assertEquals(TipoDeBicicleta.TRIA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El n�mero de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new INadador(1003, "Lucrecia", "Pecho"));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", "Olimpico", TipoDeBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoDeBicicleta.BMX));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new INadador(1008, "Luna", "Crol"));
		actual.agregarDeportista(new INadador(1009, "Victor", "Mariposa"));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", "Ironman", TipoDeBicicleta.TRIA));
			
		assertEquals((Integer) 11, actual.getCantidadSocios());		
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparado{	
		// En las carreras de nataci�n s�lo pueden inscribirse los que sean INadador
		Deportista celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		actual.crearEvento(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, "Maraton de aguas abiertas");
		
		assertNotEquals((Integer)1, actual.inscribirEnEvento("Maraton de aguas abiertas", celeste));		
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparado{		
		// En los triatlones s�lo pueden inscribirse los que sean INadador & ICiclista
		Deportista celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		
		actual.crearEvento(TipoDeEvento.TRIATLON_IRONMAN, "Triatlon Khona");
		
		assertNotEquals((Integer)1, actual.inscribirEnEvento("Triatlon Khona", celeste));		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparado{		
		Deportista celeste = new Corredor(999, "Celeste", 42000);
		Club actual = new Club("Moron");
				
		((Corredor)celeste).setCantidadDeKilometrosEntrenados(100000);
		actual.crearEvento(TipoDeEvento.CARRERA_42K, "Maraton de New York");
		
		assertEquals((Integer)1, actual.inscribirEnEvento("Maraton de New York", celeste));			
	}
}
