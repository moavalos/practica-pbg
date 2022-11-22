package centralDeAlarmas;

import java.util.ArrayList;

public class Alarma {

	private Integer idAlarma;
	private Integer codigoActivacionDesactivacion;
	private String codigoConfiguracion;
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Accion> accionesRealizadas;
	private ArrayList<Sensor> sensores;

	public Alarma(Integer idAlarma, Integer codigoActivacionDesactivacion, String codigoConfiguracion, String nombre) {
		this.idAlarma = idAlarma;
		this.codigoActivacionDesactivacion = codigoActivacionDesactivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombre = nombre;
		this.usuarios = new ArrayList<>();
		this.accionesRealizadas = new ArrayList<>();
		this.sensores = new ArrayList<>();
	}

	public void registrarAccionesRealizadas(Accion accionPorRealizar) {
		this.accionesRealizadas.add(accionPorRealizar);
	}

	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public Integer getCodigoActivacionDesactivacion() {
		return codigoActivacionDesactivacion;
	}

	public void setCodigoActivacionDesactivacion(Integer codigoActivacionDesactivacion) {
		this.codigoActivacionDesactivacion = codigoActivacionDesactivacion;
	}

	public String getCodigoConfiguracion() {
		return codigoConfiguracion;
	}

	public void setCodigoConfiguracion(String codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Accion> getAccionesRealizadas() {
		return accionesRealizadas;
	}

	public void setAccionesRealizadas(ArrayList<Accion> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

}
