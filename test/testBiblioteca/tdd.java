package testBiblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

import biblioteca.Libro;

public class tdd {

	@Test
	public void queSePuedaComprarDosVecesElMismoLibro() {
		Integer longitud = 500;
		String apellidoAutor = "Austen";
		String titulo = "Orgullo y prejuicio";
		String fechaPublicacion = "05/09/1996";
		Libro l = new Libro(longitud, apellidoAutor, titulo, fechaPublicacion);
	}
	
	@Test
	public void queSePuedaAsignarUnGeneroACadaLibro() {
		Integer longitud = 500;
		String apellidoAutor = "Austen";
		String titulo = "Orgullo y prejuicio";
		String fechaPublicacion = "05/09/1996";
		Libro l = new Libro(longitud, apellidoAutor, titulo, fechaPublicacion);
	}
	
	@Test
	public void queSePuedaContarLibrosPorGenero() {
		Integer longitud = 500;
		String apellidoAutor = "Austen";
		String titulo = "Orgullo y prejuicio";
		String fechaPublicacion = "05/09/1996";
		Libro l = new Libro(longitud, apellidoAutor, titulo, fechaPublicacion);
	}
	
	@Test
	public void queSePuedaRecortar() {
		// ?????????????????????
	}

}
