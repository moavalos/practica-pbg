package operacionesBlockbuster;

public class Alquilable extends Producto{
	
	private Double precioAlquiler;

	public Alquilable(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.precioAlquiler = 0.0;
	}

	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

}
