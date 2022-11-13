package videoClub;

public class Alquilable {
	
	private Integer codigo;
	private String descripcion;
	private Double precioAlquiler;
	
	public Alquilable(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioAlquiler = 0.0;
	}
	
	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
