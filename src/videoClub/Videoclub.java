package videoClub;

public class Videoclub {
	
	private String nombre;

	public Videoclub(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarProducto(Producto nuevoProducto) {
		// TODO Auto-generated method stub
		
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
