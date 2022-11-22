package centralDeAlarmas;

public class Accion {

	private Integer idAccion;
	private Alarma alarma;
	private Usuario usuario;
	private String fecha;
	private TipoDeOperacion tipoDeOperacion;

	public Accion(Integer idAccion, Alarma alarma, Usuario usuario, String fecha, TipoDeOperacion tipoDeOperacion) {
		this.idAccion = idAccion;
		this.alarma = alarma;
		this.usuario = usuario;
		this.fecha = fecha;
		this.tipoDeOperacion = tipoDeOperacion;
	}

	public Accion() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdAccion() {
		return idAccion;
	}

	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}

	public Alarma getAlarma() {
		return alarma;
	}

	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public TipoDeOperacion getTipoDeOperacion() {
		return tipoDeOperacion;
	}

	public void setTipoDeOperacion(TipoDeOperacion tipoDeOperacion) {
		this.tipoDeOperacion = tipoDeOperacion;
	}

}
