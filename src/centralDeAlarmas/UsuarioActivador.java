package centralDeAlarmas;

import java.util.ArrayList;

public class UsuarioActivador extends Usuario implements Activable{

	private ArrayList<Alarma> alarmas;

	public UsuarioActivador(Integer dni, String nombre) {
		super(dni, nombre);
		this.alarmas = new ArrayList<Alarma>();
	}
	
	public Boolean activarDesactivarAlarma(Alarma alarma, String codigoActivacionAlarma) {
		Boolean activada = false;
		if(alarma.getCodigoActivacionDesactivacion().equals(codigoActivacionAlarma) && alarma.getSensores().get(0).getEstado().booleanValue() == true) {
			activada = true;
		}
		return activada;
	}
	/*Cada operación debe registrar la acción realizada sobre la alarma con tipo
“ACTIVACION” o “DESACTIVACION” según corresponda.*/


}
