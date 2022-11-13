package videoClub;

public class Vendible {
	
	private Integer codigo;
	private String descripcion;
	private Double precioVenta;
	
	public Vendible(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioVenta = 0.0;
	}
	
	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
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
