package sistemaSeguro;

public class Admin extends Usuario implements Eliminable, Bloqueable {

	private Integer intentosFallidos;
	private Boolean bloqueado;
	private Boolean eliminado;

	public Admin(String nombreUsuario, String contraseña) {
		super(nombreUsuario, contraseña);
		this.eliminado = false;
		this.intentosFallidos = 0;
		this.bloqueado = false;
	}

	@Override
	public void eliminar() {
		eliminado = true;

	}

	@Override
	public Boolean isEliminado() {
		return eliminado;
	}

	@Override
	public Integer getIntentosFallidos() {
		return intentosFallidos;
	}

	@Override
	public void incrementarIntentosFallidos() {
		intentosFallidos++;

	}

	@Override
	public Boolean isBloqueado() {
		return bloqueado;
	}

	@Override
	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;

	}

}
