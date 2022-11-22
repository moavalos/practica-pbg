package centralDeAlarmas;

public class Usuario {

	private Integer dniUsuario;
	private String nombre;

	public Usuario(Integer dniUsuario, String nombre) {
		this.dniUsuario = dniUsuario;
		this.nombre = nombre;
	}

	public Integer getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(Integer dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
