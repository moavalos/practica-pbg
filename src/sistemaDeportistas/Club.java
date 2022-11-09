package sistemaDeportistas;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club {
	
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
	}

	public void agregarDeportista(Deportista d) {
		this.socios.add(d);
		
	}
	public Integer getCantidadSocios() {
		return this.socios.size();
	}
	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String string) {
		// TODO Auto-generated method stub
		
	}
	public Object inscribirEnEvento(String string, Deportista celeste) {
		// TODO Auto-generated method stub
		return null;
	}
}
