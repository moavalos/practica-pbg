package biblioteca;

import java.util.Comparator;

public class porA├▒oDePublicacion implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.getA├▒oDePublicacion().compareTo(libro2.getA├▒oDePublicacion());
	}

}
