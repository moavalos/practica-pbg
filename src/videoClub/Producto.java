package videoClub;

public class Producto {

	private Integer codigo;
	private String descripcion;
	private Estado estadoActual;
	private Cliente quienPoseeElProducto;

	public Producto(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
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

	public Estado getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(Estado estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Cliente getQuienPoseeElProducto() {
		return quienPoseeElProducto;
	}

	public void setQuienPoseeElProducto(Cliente quienPoseeElProducto) {
		this.quienPoseeElProducto = quienPoseeElProducto;
	}

}
