package supermercado;

public class Electrodomestico extends Producto{
	
	private Integer garantia;
	private String marca;
	private Double precio;

	public Electrodomestico(Integer numero, String descripcion, Integer garantia, String marca, Double precio) {
		super(numero, descripcion);
		this.garantia = garantia;
		this.marca = marca;
		this.precio = precio;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
