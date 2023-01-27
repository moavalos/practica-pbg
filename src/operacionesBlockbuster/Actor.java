package operacionesBlockbuster;

public class Actor {

	private String nombre;
	private Integer premios;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPremios() {
		return premios;
	}

	public void setPremios(Integer premios) {
		this.premios = premios;
	}

	public Actor(String nombre, Integer premios) {
		super();
		this.nombre = nombre;
		this.premios = premios;
	}

}
