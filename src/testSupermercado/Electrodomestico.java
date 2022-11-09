package testSupermercado;

public class Electrodomestico {

	private Integer numero;
	private String descripcion;
	private Integer garantia;
	private String marca;
	private Double precio;

	public Electrodomestico(Integer numero, String descripcion, Integer garantia, String marca, Double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.garantia = garantia;
		this.marca = marca;
		this.precio = precio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
