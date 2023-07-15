package sistemaSeguro;

public class Basico extends Usuario implements Bloqueable, Eliminable {

	private Integer intentosFallidos;
	private Boolean bloqueado;
    private Boolean eliminado;

	public Basico(String nombreUsuario, String password) {
		super(nombreUsuario, password);
		this.intentosFallidos = 0;
		this.bloqueado = false;
		this.eliminado = false;

	}

	public Boolean getBloqueado() {
		return bloqueado;
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

	@Override
	public void eliminar() {
		eliminado = true;

	}

	@Override
	public Boolean isEliminado() {
		return eliminado;
	}

}
