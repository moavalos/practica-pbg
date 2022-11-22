package seguros;

import java.util.Set;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
	private Set<Auto> listaAutosAsegurados;

	public PolizaDeAuto(Integer nroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(nroPoliza, asegurado, sumaAsegurada, prima);
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.listaAutosAsegurados.add(auto);

	}

	@Override
	public Object getAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setTuvoAccidentes(boolean b) {
		// TODO Auto-generated method stub

	}
}
