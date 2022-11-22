package testBiblioteca;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import biblioteca.Biblioteca;
import biblioteca.Genero;
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

	@Test
	public void queSePuedanAgregarLibrosALaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 2000);

		biblioteca.agregarLibros(libro);

		Integer valorEsperado = 1;
		Integer valorObtenido = biblioteca.obtenerLaCantidadTotalDeLibrosQueHayEnLaBiblioteca();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queNoSePuedanAgregarLibrosALaBibliotecaSiSonIguales() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.FICCION, 2000);

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);

		Integer valorEsperado = 2;
		Integer valorObtenido = biblioteca.obtenerLaCantidadTotalDeLibrosQueHayEnLaBiblioteca();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaOrdenarDelMasLargoAlMasBreve() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Shakespeare", "Gianella", Genero.FICCION, 1950);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.FICCION, 2000);

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);

		String libroMasLargoEsperado = libro.getNombreDelLibro();
		String libroMasLargoObtenido = biblioteca.ordenarLibrosDelLargoAlMasBreve().first().getNombreDelLibro();

		String libroMasCortoEsperado = libro2.getNombreDelLibro();
		String libroMasCortoObtenido = biblioteca.ordenarLibrosDelLargoAlMasBreve().last().getNombreDelLibro();

		Assert.assertEquals(libroMasLargoEsperado, libroMasLargoObtenido);
		Assert.assertEquals(libroMasCortoEsperado, libroMasCortoObtenido);
	}

	@Test
	public void queSePuedaOrdenarPorNombreDelAutor() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Shakespeare", "Gianella", Genero.FICCION, 1950);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.FICCION, 2000);

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);

		String primerLibroEsperado = libro3.getNombreDelAutor();
		String primerLibroObtenido = biblioteca.ordenarLibrosPorNombreDelAutor().first().getNombreDelAutor();

		String ultimoLibroEsperado = libro.getNombreDelAutor();
		String ultimoLibroObtenido = biblioteca.ordenarLibrosPorNombreDelAutor().last().getNombreDelAutor();

		Assert.assertEquals(primerLibroEsperado, primerLibroObtenido);
		Assert.assertEquals(ultimoLibroEsperado, ultimoLibroObtenido);
	}

	@Test
	public void queSePuedaOrdenarPorAñoDePublicacion() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Shakespeare", "Gianella", Genero.FICCION, 1950);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.FICCION, 2000);

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);

		Integer primerLibroEsperado = libro.getAñoDePublicacion();
		Integer primerLibroObtenido = biblioteca.ordenarLibrosPorAñoDePublicacion().first().getAñoDePublicacion();

		Integer ultimoLibroEsperado = libro3.getAñoDePublicacion();
		Integer ultimoLibroObtenido = biblioteca.ordenarLibrosPorAñoDePublicacion().last().getAñoDePublicacion();

		Assert.assertEquals(primerLibroEsperado, primerLibroObtenido);
		Assert.assertEquals(ultimoLibroEsperado, ultimoLibroObtenido);
	}

	@Test
	public void queSeContarLosLibrosPorGeneroFiccion() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Shakespeare", "Gianella", Genero.DIVULGACION, 1950);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.AUTOAYUDA, 2000);
		Libro libro4 = new Libro("Max la Fugitiva", "Yasmin", Genero.FICCION, 2021);
		Genero genero = Genero.FICCION;

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);
		biblioteca.agregarLibros(libro4);

		ArrayList<Libro> librosPorGenero = biblioteca.contarLibrosPorGenero(genero);

		Integer cantidadDeLibrosPorGeneroEspecificadoEsperado = 2;
		Integer cantidadDeLibrosPorGeneroEspecificadoObtenido = librosPorGenero.size();

		Assert.assertEquals(cantidadDeLibrosPorGeneroEspecificadoEsperado,
				cantidadDeLibrosPorGeneroEspecificadoObtenido);
	}

	@Test
	public void queSeContarLosLibrosPorGeneroAutoayuda() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Shakespeare", "Gianella", Genero.DIVULGACION, 1950);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.AUTOAYUDA, 2000);
		Libro libro4 = new Libro("Max la Fugitiva", "Yasmin", Genero.FICCION, 2021);
		Libro libro5 = new Libro("Shrek", "Yo", Genero.AUTOAYUDA, 2010);
		Libro libro6 = new Libro("Messi", "Kun Aguero", Genero.AUTOAYUDA, 2022);
		Genero genero = Genero.AUTOAYUDA;

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);
		biblioteca.agregarLibros(libro4);
		biblioteca.agregarLibros(libro5);
		biblioteca.agregarLibros(libro6);

		ArrayList<Libro> librosPorGenero = biblioteca.contarLibrosPorGenero(genero);

		Integer cantidadDeLibrosPorGeneroEspecificadoEsperado = 3;
		Integer cantidadDeLibrosPorGeneroEspecificadoObtenido = librosPorGenero.size();

		Assert.assertEquals(cantidadDeLibrosPorGeneroEspecificadoEsperado,
				cantidadDeLibrosPorGeneroEspecificadoObtenido);
	}

	@Test
	public void queSeContarLosLibrosPorGeneroDivulgacion() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);
		Libro libro2 = new Libro("Shakespeare", "Gianella", Genero.DIVULGACION, 1950);
		Libro libro3 = new Libro("Romeo y Julieta", "Dario", Genero.AUTOAYUDA, 2000);
		Libro libro4 = new Libro("Max la Fugitiva", "Yasmin", Genero.FICCION, 2021);
		Genero genero = Genero.DIVULGACION;

		biblioteca.agregarLibros(libro);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);
		biblioteca.agregarLibros(libro4);

		ArrayList<Libro> librosPorGenero = biblioteca.contarLibrosPorGenero(genero);

		Integer cantidadDeLibrosPorGeneroEspecificadoEsperado = 1;
		Integer cantidadDeLibrosPorGeneroEspecificadoObtenido = librosPorGenero.size();

		Assert.assertEquals(cantidadDeLibrosPorGeneroEspecificadoEsperado,
				cantidadDeLibrosPorGeneroEspecificadoObtenido);
	}

	@Test
	public void queSeSepaSiFueCompradoDosVeces() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Don Quijote de la Mancha", "Joaquin", Genero.FICCION, 1900);

		biblioteca.agregarLibros(libro);

		biblioteca.comprarLibro(libro);
		biblioteca.comprarLibro(libro);

		Integer valorEsperado = 2;
		Integer valorObtenido = biblioteca.cantidadDeVecesQueSeVendioElLibro(libro);

		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
