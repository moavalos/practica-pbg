package testPeliculas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import peliculas.Cine;
import peliculas.Pelicula;
import peliculas.SalaProyeccion;
import peliculas.SalaTienda;
import peliculas.Venta;
import peliculas.Sala;
import peliculas.ProyeccionTienda;

public class test {
	@Test
	public void queSePuedaRegistrarUnaPelicula() {

		Cine cine = new Cine("hoyts");
		Integer codigoPelicula = 1;
		String descripcion = "Duro De matar";
		Integer duracion = 105; // minutos
		Integer id = 1;

		Pelicula pelicula = new Pelicula(descripcion, duracion);
		cine.registrarPelicula(codigoPelicula, pelicula);

	}

	@Test
	public void queAlRegistrarUnaPeliculaDuplicadaLanceUnaExpcionPeliculaDuplicadaException() {

		Cine cine = new Cine("hoyts");
		Integer codigoPelicula = 1;
		String descripcion = "Duro De matar";
		Integer duracion = 105; // minutos

		Pelicula pelicula = new Pelicula(descripcion, duracion);
		cine.registrarPelicula(codigoPelicula, pelicula);

		Pelicula pelicula2 = new Pelicula("Instinto", 95);

		cine.registrarPelicula(codigoPelicula, pelicula2);

	}

	@Test
	public void queSePuedaAsignarUnaPeliculaEnUnaSalaProyecciones() {

		Pelicula pelicula = new Pelicula("Instinto", 95);

		Cine cine = new Cine("hoyts");

		String nombreSala = "sala 1";
		Sala salaProyeccion = new SalaProyeccion(nombreSala);

		cine.registrarSala(salaProyeccion);

	}

	@Test
	public void queSePuedaAsignarUnaPeliculaEnUnaSalaProyecionTienda() {

		Pelicula pelicula = new Pelicula("Instinto", 95);

		Cine cine = new Cine("hoyts");

		String nombre = "sala 1";

		SalaTienda tienda = new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");
		Sala salaProyecionTienda = new ProyeccionTienda(nombre, tienda, salaproyeccion);

		cine.registrarSala(salaProyecionTienda);

	}

	@Test
	public void queSePuedaAlRegistrarUnaVentaEnSalaTienda() {

		Cine cine = new Cine("hoyts");

		String nombre = "sala 1";
		Sala salaTienda = new SalaTienda(nombre);

		cine.registrarSala(salaTienda);

		Integer numeroVenta = 1;
		Double monto = 100d;
		Venta venta = new Venta(numeroVenta, monto);
		cine.registrarVentaAUnaSala(nombre, venta);

	}

	@Test
	public void queSePuedaAlRegistrarUnaVentaEnSalaProyeccionTienda() {

		Cine cine = new Cine("hoyts");

		String nombresala = "sala 1";

		SalaTienda tienda = new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");
		Sala salaProyeccionTienda = new ProyeccionTienda(nombresala, tienda, salaproyeccion);

		cine.registrarSala(salaProyeccionTienda);

		Integer numeroVenta = 1;
		Double monto = 100d;
		Venta venta = new Venta(numeroVenta, monto);
		cine.registrarVentaAUnaSala(nombresala, venta);

	}

	@Test
	public void queSePuedaAlRegistrarUnaPeliculasalaPoyeccionTienda() {

		Cine cine = new Cine("hoyts");

		Integer codigoPelicula = 1;
		String descripcion = "Duro De matar";
		Integer duracion = 105; // minutos
		Integer id = 1;

		Pelicula pelicula = new Pelicula(descripcion, duracion);
		cine.registrarPelicula(codigoPelicula, pelicula);

		SalaTienda tienda = new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");

		String nombreSala = "sala Mixta";
		Sala salaProyeccionTienda = new ProyeccionTienda(nombreSala, tienda, salaproyeccion);

		cine.registrarSala(salaProyeccionTienda);

		cine.registrarPeliculaAUnaSala(codigoPelicula, nombreSala);

	}

	@Test
	public void queSeCalculeCorrectamenteElTotalDeVentasDeTodasLasSalasDetipoTiendas() {

		Cine cine = new Cine("hoyts");

		String nombre = "sala Tienda";
		Sala salaTienda = new SalaTienda(nombre);

		cine.registrarSala(salaTienda);

		Integer numeroVenta = 1;
		Double monto = 100d;
		Venta venta = new Venta(numeroVenta, monto);
		cine.registrarVentaAUnaSala(nombre, venta);

		SalaTienda tienda = new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");

		String nombreProyeccionTienda = "salaMixta";
		Sala salaProyeccionTienda = new ProyeccionTienda(nombreProyeccionTienda, tienda, salaproyeccion);

		cine.registrarSala(salaProyeccionTienda);

		Integer numeroVenta2 = 2;
		Double monto2 = 300d;
		Venta venta2 = new Venta(numeroVenta2, monto2);
		cine.registrarVentaAUnaSala(nombreProyeccionTienda, venta2);

		Double valorEsperado = 400d;
		Double valorObtenido = cine.obtenerEltotalDeVetasDeTodasLasConTiendas();
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaObtenerLasPeliculasQueSeProyectaEnTodasLasSalasOrdenasPorNombre() {

	}

}
