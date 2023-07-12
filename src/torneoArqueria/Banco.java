package torneoArqueria;

public class Banco {
	
	private String nombre;
	private Integer idBanco;

	public Banco(Integer idBanco, String nombre) {
		this.idBanco = idBanco;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}
	
}
