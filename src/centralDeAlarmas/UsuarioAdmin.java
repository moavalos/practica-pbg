package centralDeAlarmas;

import java.util.ArrayList;

public class UsuarioAdmin extends Usuario {

	private ArrayList<Alarma> alarmas;
	private ArrayList<Usuario> usuarios;

	public UsuarioAdmin(Integer dni, String nombre) {
		super(dni, nombre);
		this.alarmas = new ArrayList<>();
		this.usuarios = new ArrayList<>();

	}

	public Boolean agregarAlarma(Alarma alarma) {
		return this.alarmas.add(alarma);

	}

	public Boolean agregarUsuario(Usuario usuario) {
		return this.usuarios.add(usuario);
	}

	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma) {
		for (int i = 0; i < alarmas.size(); i++) {
			if (alarmas.get(i).getIdAlarma() == idAlarma && alarmas.get(i).getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) {
				Usuario hola = new Usuario(dniUsuarioAAgregar, "joel");
				alarmas.get(i).getUsuarios().add(hola);
			}
		}

	}

	public Boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, Integer idUsuarioConfigurador) {
		Boolean ok = false;
		for (int i = 0; i < alarmas.size(); i++) {
			if(alarmas.get(i).getIdAlarma() == idAlarma && alarmas.get(i).getCodigoConfiguracion().equals(codigoConfiguracionAlarma) &&
					alarmas.get(i).getUsuarios().get(i).getDniUsuario().equals(idUsuarioConfigurador)) {
				alarmas.get(i).getSensores().add(sensor);
				ok = true;
			}
			
		}
		return ok;

	}

	public Boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma) {
		return true;
	}

	public Boolean activarDesactivarAlarma(Integer idAlarma, String codigoActivacionAlarma,
			UsuarioConfigurador usuario) {
		return null;
	}
	
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(ArrayList<Alarma> alarmas) {
		this.alarmas = alarmas;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
