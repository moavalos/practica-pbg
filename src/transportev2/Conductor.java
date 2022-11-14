package transportev2;

public class Conductor {
	
	private Integer cod;
	private String nombre;
	
	public Conductor(Integer cod, String nombre) {
		this.cod = cod;
		this.nombre = nombre;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
