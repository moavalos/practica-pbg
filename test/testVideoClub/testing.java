package testVideoClub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import videoClub.Alquilable;
import videoClub.Cliente;
import videoClub.Comestible;
import videoClub.Estado;
import videoClub.Genero;
import videoClub.Libro;
import videoClub.Pelicula;
import videoClub.Producto;
import videoClub.TipoDeConsola;
import videoClub.Vendible;
import videoClub.Videoclub;
import videoClub.Videojuego;

public class testing {
	@Test
	void queSePuedaCrearUnaPelicula() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final String ACTOR_1_ESPERADO = "Guillermo Francella";
		final String ACTOR_2_ESPERADO = "Emilio Disi";
		
		// Ejecución
		Pelicula pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.agregarActor(ACTOR_1_ESPERADO);
		pelicula.agregarActor(ACTOR_2_ESPERADO);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, pelicula.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, pelicula.getDescripcion());
		assertEquals(GENERO_ESPERADO, pelicula.getGenero());
		assertEquals(ANO_DE_ESTRENO_ESPERADO, pelicula.getAnoDeEstreno());
		assertEquals(DIRECTOR_ESPERADO, pelicula.getDirector());
		//assertTrue(pelicula.actua(ACTOR_1_ESPERADO));
		
	}
	
	void queSePuedaCrearUnVideojuego() {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		
		Videojuego juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		
		assertEquals(CODIGO_ESPERADO, juego.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, juego.getDescripcion());
		assertEquals(CONSOLA_ESPERADA, juego.getTipo());
		
	}
	
	void queSePuedaCrearUnLibro() {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		
		Libro libro = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		
		assertEquals(CODIGO_ESPERADO, libro.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, libro.getCodigo());
		assertEquals(AUTOR_ESPERADO, libro.getAutor());
		assertEquals(EDITORIAL_ESPERADA, libro.getEditorial());
		
	}
	
	void queSePuedaCrearUnComestible() {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Chomps";
		
		Comestible comestible = new Comestible(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
	
		assertEquals(CODIGO_ESPERADO, comestible.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, comestible.getCodigo());
	}
	
	@Test
	void queUnaPeliculaSeaVendible() {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final Double PRECIO_VENTA = 5000.0;
		
		Vendible pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.setPrecioVenta(PRECIO_VENTA);
		
		assertEquals(PRECIO_VENTA, pelicula.getPrecioVenta());		
	}

	@Test
	void queUnJuegoSeaAlquilable() {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Double PRECIO_ALQUILER = 5000.0;
		
		Alquilable juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		juego.setPrecioAlquiler(PRECIO_ALQUILER);
		
		assertEquals(PRECIO_ALQUILER, juego.getPrecioAlquiler());		
	}

	@Test
	void queSePuedaCrearUnCliente() {
		final Integer CODIGO_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Oculto";
		final Integer EDAD_ESPERADA = 23;
		
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		assertEquals(CODIGO_ESPERADO, nuevoCliente.getCodigo());
		assertEquals(NOMBRE_ESPERADO, nuevoCliente.getNombre());
		assertEquals(APELLIDO_ESPERADO, nuevoCliente.getApellido());
		assertEquals(EDAD_ESPERADA, nuevoCliente.getEdad());
		
	}

	@Test
	void queSePuedaVenderUnLibro() {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.VENDIDO;
		
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Libro nuevoProducto = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		video.agregarProducto(nuevoProducto);
		
		assertEquals(ESTADO_INICIAL_ESPERADO, ((Object) video.buscarProducto(nuevoProducto)).getEstadoActual());
		assertTrue(video.vender(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	void queSePuedaAlquilarUnaPelicula() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);		
		
		video.agregarProducto(nuevoProducto);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.alquilar(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	void queSeNoSePuedaVenderUnComestibleVendido() {
		
	}
	
	@Test
	void queSeNoSePuedaAlquilarUnJuegoAlquilado() {
		
	}
	
	@Test
	void queLuegoDeDevueltaUnaPeliculaSePuedaAlquilar() {
		
	}
	
	@Test
	void queSeNoSePuedaAlquilarUnPeliculaAUnMenor() {
		
	}

}
