package billeteras;

public class Comercio {

	private String nombreComercio;
	private Long cuitComercio;

	public Comercio(String nombreComercio, Long cuitComercio) {
		this.nombreComercio = nombreComercio;
		this.cuitComercio = cuitComercio;
	}

	public String getNombreComercio() {
		return nombreComercio;
	}

	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}

	public Long getCuitComercio() {
		return cuitComercio;
	}

	public void setCuitComercio(Long cuitComercio) {
		this.cuitComercio = cuitComercio;
	}

}
