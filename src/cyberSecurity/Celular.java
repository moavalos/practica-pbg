package cyberSecurity;

public class Celular extends Dispositivo {

	private String iMei;

	public Celular(String iMei, TipoDeAutenticacion autenticacion) {

		super(autenticacion);
		this.iMei = iMei;
	}

}
