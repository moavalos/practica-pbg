package supermercado;

import java.util.ArrayList;
import java.util.Set;

import sistemaDeportistas.Deportista;

public class Supermercado {
	
	private String nombre;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void ingresarProducto(Producto producto) {
		this.productos.add(producto);
		
	}

	public ArrayList<Producto> getOfertaDeProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Producto> getStock(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer registrarNuevaVenta(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer pRODUCTO_A_COMPRAR_1) {
		// TODO Auto-generated method stub
		
	}

	public Object getVenta(Integer numeroDeVenta) {
		// TODO Auto-generated method stub
		return null;
	}

}
