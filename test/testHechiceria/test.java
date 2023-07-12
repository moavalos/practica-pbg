package testHechiceria;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import hechiceria.Agrandar;
import hechiceria.Animal;
import hechiceria.Expelliarmus;
import hechiceria.Hechizable;
import hechiceria.Hechizo;
import hechiceria.LibroDeHechizos;
import hechiceria.Mueble;

public class test {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() {
		// set up
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus("expelliarmus");
		// execute
		libro.agregarHechizo(desarme);
		// verify
		assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void verSiUnHechizableEstaHechizado() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus("expelliarmus");
		Hechizable perro = new Animal();
		
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		
		hechizo.aplicarHechizo(perro);
		assertEquals("Me desarmaron", perro.getEstado());
	}

	@Test
	public void verSiUnHechizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		crecer.setNombre("enormuvus");
		Hechizable mesa = new Mueble();
		
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}

}
