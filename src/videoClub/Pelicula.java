package videoClub;

public class Pelicula extends Vendible {

	private Genero genero;
	private Integer anoDeEstreno;
	private String director;

	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero = genero;
		this.anoDeEstreno = anoDeEstreno;
		this.director = director;
	}

	public Object actua(String actor) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarActor(String actor) {

	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
