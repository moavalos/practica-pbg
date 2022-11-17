package cyberSecurity;

public class Cajero extends Dispositivo {
	private String ip;

	public Cajero(String ip, TipoDeAutenticacion autenticacion) {
		super(autenticacion);
		this.ip = ip;
	}
}
