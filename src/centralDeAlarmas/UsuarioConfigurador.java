package centralDeAlarmas;

import java.util.ArrayList;

public class UsuarioConfigurador extends Usuario implements Configurable {

	private ArrayList<Alarma> alarmas;

	public UsuarioConfigurador(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public void agregarUsuarioAAlarma(Integer dniUsuario, Integer idAlarma, String codConfiguracionAlarma) {
		TipoDeOperacion accionRegistrada;
		for (int i = 0; i < alarmas.size(); i++) {
			if (alarmas.get(i).getIdAlarma() == idAlarma
					&& alarmas.get(i).getCodigoConfiguracion().equals(codConfiguracionAlarma)) {
				Usuario hola = new Usuario(dniUsuario, "joel");
				alarmas.get(i).getUsuarios().add(hola);
				accionRegistrada = alarmas.get(i).getAccionesRealizadas().get(i).getTipoDeOperacion().CONFIGURACION;
			}
		}
	}

	public void agregarSensorAAlarma(Integer idAlarma, String codConfiguracionAlarma, Sensor sensor) {
		TipoDeOperacion accionRegistrada;
		for (int i = 0; i < alarmas.size(); i++) {
			if (alarmas.get(i).getIdAlarma() == idAlarma
					&& alarmas.get(i).getCodigoConfiguracion().equals(codConfiguracionAlarma)) {
				alarmas.get(i).getSensores().add(sensor);
				accionRegistrada = alarmas.get(i).getAccionesRealizadas().get(i).getTipoDeOperacion().CONFIGURACION;
			}
		}
	}

	public void activarSensor(Integer idSensor, Integer idAlarma, String codConfiguracionAlarma) {
		TipoDeOperacion accionRegistrada;
		Boolean activada = false;
		for (int i = 0; i < alarmas.size(); i++) {
			if(alarmas.get(i).getIdAlarma() == idAlarma && alarmas.get(i).getCodigoConfiguracion().equals(codConfiguracionAlarma) && alarmas.get(i).getSensores().get(i).getIdSensor() == idSensor) {
				activada = true;
				accionRegistrada = alarmas.get(i).getAccionesRealizadas().get(i).getTipoDeOperacion().CONFIGURACION;
			}
		}
	}
	/*
	 * Cada operación debe registrar la acción realizada sobre la alarma con tipo
	 * “CONFIGURACION”.
	 */

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(ArrayList<Alarma> alarmas) {
		this.alarmas = alarmas;
	}

}
