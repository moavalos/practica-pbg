package seguros;

import java.util.Set;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales {
	private Set<Persona> listaBeneficiarios;
	private TipoDeBeneficiario parentesco;
	private Set<BienAsegurado> listaBienesAsegurados;

	public Set<Persona> getListaBeneficiarios() {
		return listaBeneficiarios;
	}

	public void setListaBeneficiarios(Set<Persona> listaBeneficiarios) {
		this.listaBeneficiarios = listaBeneficiarios;
	}

	public TipoDeBeneficiario getParentesco() {
		return parentesco;
	}

	public void setParentesco(TipoDeBeneficiario parentesco) {
		this.parentesco = parentesco;
	}

	public Set<BienAsegurado> getListaBienesAsegurados() {
		return listaBienesAsegurados;
	}

	public void setListaBienesAsegurados(Set<BienAsegurado> listaBienesAsegurados) {
		this.listaBienesAsegurados = listaBienesAsegurados;
	}

	public PolizaCombinadoFamiliar(Integer nroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(nroPoliza, asegurado, sumaAsegurada, prima);
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.listaBienesAsegurados.add(auto);

	}

	@Override
	public Double getPremio() {
		return null;
	}

	@Override
	public Persona getAsegurado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario parentesco) {
		this.listaBeneficiarios.add(beneficiario);
		this.parentesco = parentesco;
	}

	@Override
	public Object obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setTuvoAccidentes(boolean b) {
		// TODO Auto-generated method stub

	}

	public Integer obtenerCantidadDeBeneficiario() {
		return this.listaBeneficiarios.size();
	}

	public void agregarBienAsegurado(Vivienda casa) {
		this.listaBienesAsegurados.add(casa);
	}
}
