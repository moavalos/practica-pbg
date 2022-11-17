package cyberSecurity;

import java.util.Set;

public interface Alertable {
	
	public void marcarComoCasoSospechoso();
	public void confirmarSiFueFraude(Boolean fueFraude);
	public Boolean getCasoSospechoso();
	public Boolean getFueFraude();
	void monitorear(Set<Denunciable> listaNegra) throws FraudeException;

}
