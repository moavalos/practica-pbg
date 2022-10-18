package SistemaBar;

import java.util.Objects;

public class Persona  implements Comparable<Persona> {

	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
//		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);

	}

}


