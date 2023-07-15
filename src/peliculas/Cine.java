package peliculas;

import java.util.Map;
import java.util.Set;

public class Cine {

	// EN Los cines hay 3 tipos de salas Proyectables , Tiendas, ProyectablesTiendas
	// No cambisar
	private Map<Integer, Pelicula> peliculas;

	// No pueden existir 2 Salas con el mismo nombre
	private Set<Sala> salas;

	private String nombre;

	/*
	 * Busca la sala Por nombre. y registra la venta en en dicha sala\ en caso de no
	 * encontrar la tienda lanza una excpetion. Las ventas solamente se registran en
	 * las salas Tienda y en las TiendasPreyectables. Las salas Proyectables no
	 * registranventas. En caso que se quiera Asiganar una venta en estos tipos de
	 * salas lanza una exception VentaSalaException
	 */

	public Cine(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * busca la sala por nombre y registra La Venta en caso que se registre una
	 * venta en una sala de proyeccion lanza una exception SalaException
	 * 
	 */
	public void registrarVentaAUnaSala(String nombre, Venta venta) {

	}

	// Registrar Una pelicula en una sala donde se preyectan una Pelicula
	// en caso que se registre una pelicula en una sala de tienda lanza una
	// exception SalaException
	// Si el codigo Pelicula esta duplicado Lanza una Exception
	// PeliculaExistenteExeption
	public void registrarPelicula(Integer codigo, Pelicula pelicula) {

	}

	/*
	 * registra Una sala No se pueden registrar 2 salas con el mismo nombre, en caso
	 * que este se repita lanza Una Exception SalaDuplicadaException
	 * 
	 */
	public void registrarSala(Sala sala) {

	}

	/*
	 * Registra una pelicula en las salas de proyecciones en caso que la pelicula no
	 * existe lanza exception en caso que la sala no exista launa excpetion
	 * salaInixistennte xception
	 */

	public void registrarPeliculaAUnaSala(Integer codigoPelicula, String nombreSala) {
		// TODO Auto-generated method stub

	}

	public Double obtenerEltotalDeVetasDeTodasLasConTiendas() {
		// TODO Auto-generated method stub
		return null;
	}

}
