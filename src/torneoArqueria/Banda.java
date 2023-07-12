package torneoArqueria;

public class Banda {

	private Integer idBanda;
	private String nombre;

	public Banda(Integer idBanda, String nombre) {
		this.idBanda = idBanda;
		this.nombre = nombre;
	}

	public Integer getIdBanda() {
		return idBanda;
	}

	public void setIdBanda(Integer idBanda) {
		this.idBanda = idBanda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
