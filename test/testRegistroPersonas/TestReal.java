package testRegistroPersonas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestReal {

	@Test
	public void queSePuedaInstanciarUnaCiudad() {

		// ESTO ANDA

		String PROVINCIA_ESPERADA = "Cordoba";
		String PROVINCIA_ESPERADA_2 = "Buenos Aires";

		Ciudad cordobaCapital = new Ciudad(1334, "Cordoba Capital", "Cordoba");

		Provincia buenosAires = new Provincia("Buenos Aires");
		Ciudad castelar = new Ciudad(1235, "Castelar", buenosAires);

		assertEquals(PROVINCIA_ESPERADA, cordobaCapital.getProvincia().getNombre());

		buenosAires = null;

		assertEquals(PROVINCIA_ESPERADA_2, castelar.getProvincia().getNombre());
	}

	@Test
	public void verificarQueSePuedaObtenerElListadoDePersonasDeUnaProvincia() {
		// preparacion

		Provincia buenosAires = new Provincia("Buenos Aires");
		Ciudad cordobaCapital = new Ciudad(1334, "Cordoba Capital", buenosAires);
		Direccion direccion = new Direccion("pedraza", 533, cordobaCapital);

		Persona pablo = new Persona("Pablo", "Perez", "iturri 912", "merlo", "buenos aires");
		Persona juan = new Persona("juan", "carballo2", direccion, cordobaCapital, buenosAires);

		// SOS UNA PELOTUDA

		Persona personasEnLaProvincia[];
		String NOMBRRE_ESPERADO = "buenos aires";
		int CANTIDAD_DE_REGISTROS = 3;

		RegistrarPersona anses = new RegistrarPersona();
		anses.registrarPersona(pablo);
		anses.registrarPersona(juan);

		personasEnLaProvincia = anses.listadoDePersonas("buenos Aires");

		assertNotNull(personasEnLaProvincia);
		assertEquals(NOMBRRE_ESPERADO, personasEnLaProvincia[0].getCiudad().getProvincia().getNombre());
		assertNotEquals("juan", personasEnLaProvincia[1].getNombre());
		assertEquals(NOMBRRE_ESPERADO, personasEnLaProvincia[1].getCiudad().getProvincia().getNombre());
		assertEquals(NOMBRRE_ESPERADO, personasEnLaProvincia[2].getCiudad().getProvincia().getNombre());
		assertEquals(CANTIDAD_DE_REGISTROS, personasEnLaProvincia.length);
	}

}
