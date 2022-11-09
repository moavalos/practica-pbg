package testSupermercado;

public class Galletitas extends Comestible {
	
	private String marca;

	public Galletitas(Integer numero, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double precio) {
		super(numero, descripcion, fechaDeElaboracion, fechaDeVencimiento, precio);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
