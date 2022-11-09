package sistemaDeportistas;

public class Deportista {
	
	private String nombre;
	private Integer numeroDeSocio;
	
	public Deportista(Integer numeroDeSocio, String nombre) {
		this.numeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}
	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}
	

}
