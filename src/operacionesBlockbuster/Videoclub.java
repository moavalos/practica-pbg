package operacionesBlockbuster;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {

	private String nombre;
	private List<Producto> productos;
	private List<Producto> productosVendidos;
	private List<Cliente> clientes;

	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
		this.productosVendidos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);

	}

	public Producto buscarProducto(Producto nuevoProducto) {
		if (nuevoProducto.getCodigo().equals(productos.get(0).getCodigo())) {
			return nuevoProducto;
		}
		return null;
	}

	public boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		if(productos.contains(nuevoProducto) && buscarProducto(nuevoProducto) != null) {
			 if(nuevoCliente.getCodigo().equals(clientes.get(0).getCodigo())) {
				 productos.remove(nuevoProducto);
				 productosVendidos.add(nuevoProducto);
				 return true;
			 }
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
