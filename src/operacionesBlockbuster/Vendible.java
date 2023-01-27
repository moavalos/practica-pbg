package operacionesBlockbuster;

public class Vendible extends Producto{
	
	private Double precioVenta;

	public Vendible(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.precioVenta = 0.0;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

}
