package testCallcenter;

import static org.junit.Assert.*;

import org.junit.Test;

import callcenter.Contacto;
import callcenter.Llamada;
import callcenter.Provincia;

public class tdd {

	@Test
	public void queSePuedaCrearContactos() {
		String nombre = "juana", apellido = "perez", email = "jfldks@gmail.com", 
				direccion = "iturri 912", codigo = "1718", localidad = "libertad";
		Integer celular = 22528877;
		Provincia provincia = Provincia.BUENOS_AIRES;
		Boolean esCliente = true;
		Contacto c = new Contacto(nombre, apellido, celular, email, direccion, codigo, localidad, provincia, esCliente);
		
		assertNotNull(c);
		assertEquals(nombre, c.getNombre());
		assertTrue(c.getEsCliente());
	}
	
	@Test
	public void queSePuedaLlamarAUnContacto() {
		String nombre = "juana", apellido = "perez", email = "jfldks@gmail.com", 
				direccion = "iturri 912", codigo = "1718", localidad = "libertad";
		Integer celular = 22528877;
		Provincia provincia = Provincia.BUENOS_AIRES;
		Boolean esCliente = true;
		Contacto c = new Contacto(nombre, apellido, celular, email, direccion, codigo, localidad, provincia, esCliente);
		
		Boolean fueExitosa = true;
		String observaciones = "dsñl";
		Llamada l = new Llamada(fueExitosa, observaciones);
		
		c.registrarNuevaLlamada(l);
		Integer llamadasRecibidas = 1;
		
		assertEquals(llamadasRecibidas, c.getCantLlamadasRecibidas());
	}
	
	@Test
	public void queSeValideUnEMail() {
		String nombre = "juana", apellido = "perez", email = "jfldks@gmail.com", 
				direccion = "iturri 912", codigo = "1718", localidad = "libertad";
		Integer celular = 22528877;
		Provincia provincia = Provincia.BUENOS_AIRES;
		Boolean esCliente = true;
		Contacto c = new Contacto(nombre, apellido, celular, email, direccion, codigo, localidad, provincia, esCliente);
		
		assertTrue(c.esEmailValido(email));
	}

}
