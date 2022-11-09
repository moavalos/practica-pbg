package sistemaDeportistas;

public class Triatleta extends Deportista {
	
	private String distanciaPreferida;
	private TipoDeBicicleta tipoBicicleta;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoBicicleta = tipoBicicleta;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

}
