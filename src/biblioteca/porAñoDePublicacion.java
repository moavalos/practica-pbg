package biblioteca;

import java.util.Comparator;

public class porAñoDePublicacion implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.getAñoDePublicacion().compareTo(libro2.getAñoDePublicacion());
	}

}
