package testSupermercado;

public class Heladera extends Electrodomestico {

	private Boolean noFrost;

	public Heladera(Integer numero, String descripcion, Boolean noFrost, Integer garantia, String marca,
			Double precio) {
		super(numero, descripcion, garantia, marca, precio);
		this.noFrost = noFrost;
	}

	public Boolean getNoFrost() {
		return noFrost;
	}

	public void setNoFrost(Boolean noFrost) {
		this.noFrost = noFrost;
	}

}
