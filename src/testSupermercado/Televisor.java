package testSupermercado;

public class Televisor extends Electrodomestico {

	private Integer pulgadas;

	public Televisor(Integer numero, String descripcion, Integer pulgadas, Integer garantia, String marca,
			Double precio) {
		super(numero, descripcion, garantia, marca, precio);
		this.pulgadas = pulgadas;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

}
