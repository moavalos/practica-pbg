package operacionesBlockbuster;

import java.util.LinkedList;
import java.util.List;

public class Pelicula extends Vendible{
	
	private Genero genero;
	private Integer anioEstreno;
	private String director;
	private List <Actor> actoresPrincipales; 

	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anioEstreno, String director) {
		super(codigo, descripcion);
		this.genero = genero;
		this.anioEstreno = anioEstreno;
		this.director = director;
		this.actoresPrincipales = new LinkedList<>();
	}
	
	public boolean actua(Actor actor) {
		if(actoresPrincipales.contains(actor)) {
			return true;
		}
		return false;
	}
	
	public void agregarActor(Actor actor) {
		this.actoresPrincipales.add(actor);
		
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(Integer anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<Actor> getActoresPrincipales() {
		return actoresPrincipales;
	}

	public void setActoresPrincipales(List<Actor> actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}

}
