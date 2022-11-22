package seguros;

public class PolizaAccidentesPersonales implements SegurosDeVida {
	private Integer nroPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	
	public PolizaAccidentesPersonales(Integer nroPoliza, Persona asegurado, Double sumaAsegurada,
			Double prima) {
		this.nroPoliza=nroPoliza;
		this.asegurado=asegurado;
		this.sumaAsegurada=sumaAsegurada;
		this.prima=prima;
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario parentesco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPremio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAsegurado() {
		// TODO Auto-generated method stub
		return null;
	}

}
