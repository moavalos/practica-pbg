package testSupermercado;

public class Comestible {
	
	private Integer numero;
	private String descripcion;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double precio;
	
	public Comestible(Integer numero, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
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
