package seguros;

import java.util.Collection;
import java.util.Set;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> listaPolizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre=nombre;
	}

	public void denunciarSiniestro(Integer nroPoliza) throws PolizaInexistente {
		Poliza poliza = getPoliza(nroPoliza);
		if(poliza instanceof SegurosGenerales)
			poliza.setSufrioRobos(true);
		if(poliza instanceof SegurosDeVida)
			poliza.setTuvoAccidentes(true);
	}
	
	public void agregarPoliza(PolizaDeAuto polizaDeAuto) {
	}

	public void denunciarSiniestro(int i) {
		
	}

	public Object getPoliza() {
		return this.getPoliza();
	}

	public void agregarPoliza(PolizaAccidentesPersonales polizaAccidentesPersonales) {
		listaPolizas.addAll((Collection<? extends Poliza>) polizaAccidentesPersonales);
		
	}

	public void agregarPoliza(PolizaCombinadoFamiliar polizaCombinadoFamiliar) {
		listaPolizas.add(polizaCombinadoFamiliar);
		
	}
	
	
	public Object obtenerLaCantidadDePolizasEmitidas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Poliza getPoliza(Integer nroPoliza) throws PolizaInexistente {
		for(Poliza poliza:listaPolizas) {
			if(poliza.getNroPoliza().equals(nroPoliza))
				return poliza;
			}
		throw new PolizaInexistente("No se encontro el numero de poliza");
		
	}

}
