package seguros;

public interface SegurosDeVida {
	
	void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario parentesco);

	Object obtenerCantidadDeBeneficiarios();

	Object getPremio();

	Object getAsegurado();
}
