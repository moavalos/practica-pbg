package supermercado;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta

	public Supermercado(String nombre) {
		// Constructor de la clase
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
		// Devuelve el conjunto de productos que se comercializan
	}

	public Integer getStock(Integer codigo) {
		return codigo;
		// Devuelve la cantidad de unidades de un producto determinado
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		return null;
		// Verifica si un producto existe
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		return null;
		// Busca la disponibilidad de un producto
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {
		return null;
		// Devuelve una venta en funci�n de su n�mero identificatorio
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}

}
