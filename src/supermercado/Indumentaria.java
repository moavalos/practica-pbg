package supermercado;

public class Indumentaria extends Producto{
	
	private String marca;
	private String color;
	private Double precio;
	
	public Indumentaria(Integer numero, String descripcion, String marca, String color, Double precio) {
		super(numero, descripcion);
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
