package supermercado;

public class Comestible extends Producto {
	
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double precio;
	
	public Comestible(Integer numero, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double precio) {
		super(numero, descripcion);
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.precio = precio;
	}

	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
