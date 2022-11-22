package biblioteca;

import java.util.Comparator;

public class porCantidadDeCaracteres implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro2.getCantidadDeCaracteresDelLibro().compareTo(libro1.getCantidadDeCaracteresDelLibro());
	}

}
