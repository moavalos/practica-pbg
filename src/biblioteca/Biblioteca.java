package biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {

	private Set<Libro> librosActuales;

	public Biblioteca() {
		this.librosActuales = new HashSet<>();
	}

	public void agregarLibros(Libro libro) {
		this.librosActuales.add(libro);
	}

	public Integer obtenerLaCantidadTotalDeLibrosQueHayEnLaBiblioteca() {
		return this.librosActuales.size();
	}

	public TreeSet<Libro> ordenarLibrosDelLargoAlMasBreve() {
		TreeSet<Libro> librosOrdenadosDelLargoAlMasBreve = new TreeSet<>(new porCantidadDeCaracteres());
		librosOrdenadosDelLargoAlMasBreve.addAll(librosActuales);
		return librosOrdenadosDelLargoAlMasBreve;
	}

	public TreeSet<Libro> ordenarLibrosPorNombreDelAutor() {
		TreeSet<Libro> librosOrdenadosPorNombreDelAutor = new TreeSet<>();
		librosOrdenadosPorNombreDelAutor.addAll(librosActuales);
		return librosOrdenadosPorNombreDelAutor;
	}

	public TreeSet<Libro> ordenarLibrosPorAñoDePublicacion() {
		TreeSet<Libro> librosOrdenadosporAñoDePublicacion = new TreeSet<>(new porAñoDePublicacion());
		librosOrdenadosporAñoDePublicacion.addAll(librosActuales);
		return librosOrdenadosporAñoDePublicacion;
	}

	public ArrayList<Libro> contarLibrosPorGenero(Genero genero) {
		ArrayList<Libro> librosPorGenero = new ArrayList<>();
		for (Libro libros : librosActuales) {
			if (libros.getGenero() == genero) {
				librosPorGenero.add(libros);
			}
		}
		return librosPorGenero;
	}

	public void comprarLibro(Libro libro) {
		libro.setFueComprado(true);
		libro.cantidadDeVecesComprado++;
	}

	public Integer cantidadDeVecesQueSeVendioElLibro(Libro libro) {
		return libro.getCantidadDeVecesComprado();
	}
}
