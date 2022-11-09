package testCarrito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;

import org.junit.Test;

import carritoDeCompras.Carrito;
import carritoDeCompras.Descuento;
import carritoDeCompras.Producto;

public class test {
	@Test
	public void testQueVerificaQueElCarritoNoEstaVacío() {
		Carrito jumbo = new Carrito(null);

		Producto lenteja = new Producto ("Lenteja", "Legumbres", 80.0);
		
		jumbo.agregarProducto(lenteja);
		
		assertNotNull(jumbo.getProductos());
	}

	@Test
	public void testQueVerificaTenerElCarritoConProducto() {
		Carrito jumbo= new Carrito(null);

		Producto algarroba = new Producto ("Algarroba", "Almacen", 400.0);
		
		jumbo.agregarProducto(algarroba);
		Integer valorEsperado = 1;
		Integer valorObtenido = jumbo.obtenerLaCantidadDeProductosEnElCarrito();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueVerificaTenerElCarritoConVariosProductos() {
		Carrito jumbo= new Carrito(null);
		
		Producto tofu = new Producto ("Tofu", "Almacen", 80.0);
		Producto algas = new Producto ("Algas", "Almacen", 60.0);
		Producto garbanzos = new Producto ("Garbanzos", "Almacen", 40.0);
		Producto milanesaDeSoja = new Producto ("Milanesa de soja", "Almacen", 80.0);
		
		jumbo.agregarProducto(tofu);
		jumbo.agregarProducto(algas);
		jumbo.agregarProducto(garbanzos);
		jumbo.agregarProducto(milanesaDeSoja);
		
		Integer valorEsperado = 4;
		Integer valorObtenido = jumbo.obtenerLaCantidadDeProductosEnElCarrito();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueVerificaAplicarElDescuento() {

		Producto tofu = new Producto ("Tofu", "Almacen", 80.0);
		Producto algas = new Producto ("Algas", "Almacen", 60.0);
		Producto garbanzos = new Producto ("Garbanzos", "Almacen", 40.0);
		Producto milanesaDeSoja = new Producto ("Milanesa de soja", "Almacen", 80.0);
		Producto manaos = new Producto("Manaos Cola", "Gaseosas", 80.0);
		Producto patagonia = new Producto("Patagonia Amber Lager", "Cervezas", 100.0);
		
		Descuento treintaPorCientoAPartirDeTresUnidades = new Descuento(manaos, 3, 0.3);
		Descuento veintePorCientoAPartirDeDosUnidades = new Descuento(patagonia, 2, 0.2);

		HashSet<Descuento> productosEnPromocion = new HashSet<Descuento>();
		
		productosEnPromocion.add(treintaPorCientoAPartirDeTresUnidades);
		productosEnPromocion.add(veintePorCientoAPartirDeDosUnidades);
		
		
		Carrito jumbo= new Carrito(productosEnPromocion);
		
		jumbo.agregarProducto(tofu);
		jumbo.agregarProducto(algas);
		jumbo.agregarProducto(garbanzos);
		jumbo.agregarProducto(milanesaDeSoja);
		jumbo.agregarProducto(milanesaDeSoja);
		jumbo.agregarProducto(milanesaDeSoja);
		jumbo.agregarProducto(manaos);
		jumbo.agregarProducto(manaos);
		jumbo.agregarProducto(patagonia);
		jumbo.agregarProducto(patagonia);
		jumbo.agregarProducto(patagonia);
		jumbo.agregarProducto(patagonia);
		
		Double valorEsperado = 900.0;
		Double valorObtenido = jumbo.getImporteTotal();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
