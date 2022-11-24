package cyberSecurity;

import java.util.Set;

public class PagoDeServicio extends TransaccionMonetaria implements Alertable {

	public PagoDeServicio(Cliente cliente, Dispositivo dispositivo, Double monto) {
		super(cliente, dispositivo, monto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void marcarComoCasoSospechoso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getCasoSospechoso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getFueFraude() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void monitorear(Set<Denunciable> listaNegra) throws FraudeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer calcularScore(Set<Denunciable> listaNegra) {
		// TODO Auto-generated method stub
		return null;
	}

}
