package ControlBiometricoTDD;

public class ControlBiometrico {
	
	private String nombre;
	private Usuario usuarios;
	private final Integer REGISTROS;
	
	public ControlBiometrico(String nombre, Usuario usuarios) {
		this.nombre = nombre;
		this.usuarios = new Usuario();
		this.REGISTROS = 50000;
	}
	
	public Usuario registrarUsuario() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Integer getREGISTROS() {
		return REGISTROS;
	}

	
}
