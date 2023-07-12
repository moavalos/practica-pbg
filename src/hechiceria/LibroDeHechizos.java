package hechiceria;

import java.util.ArrayList;
import java.util.List;

public class LibroDeHechizos {
	
	private List<Hechizo> hechizos;
	
	public LibroDeHechizos() {
		this.hechizos = new ArrayList<>();
	}

	public void agregarHechizo(Hechizo hechizo) {
		hechizos.add(hechizo);
		
	}

	public Hechizo buscar(String nombre) {
		for (Hechizo hechizo : hechizos) {
			if(hechizo.getNombre().equals(nombre))
				return hechizo;
		}
		return null;
	}

	

}
