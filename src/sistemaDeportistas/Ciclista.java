package sistemaDeportistas;

public class Ciclista extends Deportista {

	private TipoDeBicicleta tipoBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta tipoBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoBicicleta = tipoBicicleta;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoBicicleta;
	}

}
