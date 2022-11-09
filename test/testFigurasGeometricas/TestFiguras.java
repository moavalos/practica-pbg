package testFigurasGeometricas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import figurasGeometricas.Circulo;
import figurasGeometricas.Cuadrado;
import figurasGeometricas.Elipse;
import figurasGeometricas.Figura;
import figurasGeometricas.Punto;
import figurasGeometricas.Rectangulo;

public class TestFiguras {
	@Test
	public void queSePuedaInformarElNombreDeUnaFiguraCirculo() {
		String nombre = "circulito";
		Punto centro = new Punto(1.0, 1.0);
		Circulo circulito = new Circulo(nombre, centro, 0.0, 0.0);
		assertEquals(nombre, circulito.getNombre());
	}

	@Test

	public void queSePuedaInformarElNombreDeUnaFiguraCuadrada() {
		String name = "cuadradito";
		Punto centro = new Punto(1.0, 1.0);
		Cuadrado cuadradito = new Cuadrado(name, centro, 0.0, 0.0);
		assertEquals(name, cuadradito.getNombre());
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCirculo() {
		String nombre = "circulo";
		String color = "azul";
		Punto centro = new Punto(1.0, 1.0);
		Circulo circulito = new Circulo(nombre, color, centro, 0.0, 0.0);
		String colorObtenido = circulito.getColor();
		assertEquals(color, colorObtenido);
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCuadrada() {
		Punto centro = new Punto(1.0, 1.0);
		Cuadrado cuadradito = new Cuadrado("cuadrado", "violeta", centro, 0.0, 0.0);
		assertEquals("violeta", cuadradito.getColor());
	}

	/*
	 * @Test public void queSePuedaCrearUnaFiguraDeColorBlanco() { String nombre =
	 * "figura"; String color = "blanco"; Figura figura = new Figura(nombre, color);
	 * // las clases abstractas no pueden ser instanciadas String valorObtenido =
	 * figura.getColor(); assertEquals(color, valorObtenido); }
	 */

	@Test
	public void queSePuedaObtenerElNombreDeUnaFiguraCuadrada() {
		String nombre = "figura";
		String color = "blanco";
		Punto centro = new Punto(1.0, 1.0);
		Figura cuadrado = new Cuadrado(nombre, color, centro, 0.0, 0.0);
		String valorObtenido = cuadrado.getColor();
		assertEquals(color, valorObtenido);
	}

	@Test
	public void queSePuedaCalcularElAreaDeUnaFigura() {
		Double base = 4.0;
		Double areaEsperada = 16.0;
		Punto centro = new Punto(1.0, 1.0);
		Figura cuadrado = new Cuadrado(null, centro, base);
		assertEquals(areaEsperada, cuadrado.calcularArea());
	}

	@Test
	public void crearUnaElipseEn1_1ConEjeMayor2YEjeMenor1ConArea6_283() {
		Punto centro = new Punto(1.0, 1.0);
		Elipse elipse = new Elipse(null, centro, 2, 1);
		assertEquals(6.283, elipse.calcularArea(), 0.001);
	}

	@Test
	public void mover3_1UnaElipseEn1_1LaLlevaA4_2() {
		Punto centro = new Punto(1.0, 1.0);
		Elipse elipse = new Elipse(null, centro, 2, 1);
		elipse.mover(3, 1);
		assertEquals(4, elipse.getPosicion().getEjeX(), 0.001);
		assertEquals(2, elipse.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void crearUnRectanguloEn1_1ConBase2YAltura1TieneArea2() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rectangulo = new Rectangulo(null, esqInfIzq, 2.0, 1.0);
		assertEquals(2, rectangulo.calcularArea(), 0.001);
	}

	@Test
	public void crearUnRectanguloEn1_1ConBase2YAltura1TieneEsquinaDerechaEn3_2() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(null, esqInfIzq, 2.0, 1.0);
		assertEquals(3, rec.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(2, rec.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnRectanguloEn1_1LoLlevaA_3_1() {
		Punto EsqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(null, EsqInfIzq, 2.0, 1.0);
		rec.mover(3, 1);
		assertEquals(4, rec.getPosicion().getEjeX(), 0.001);
		assertEquals(2, rec.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnRectanguloEn1_1ConBase2YAltura1ColocaLaEsqSupDerEn_6_3() {
		Punto EsqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(null, EsqInfIzq, 2.0, 1.0);
		rec.mover(3, 1);
		assertEquals(6, rec.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(3, rec.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void crearUnCiculoEn1_1ConRadio2TieneArea12_566() {
		Punto centro = new Punto(1.0, 1.0);
		Circulo cir = new Circulo(null, centro, 2.0, 0.0);
		assertEquals(12.566, cir.calcularArea(), 0.001);
	}

	@Test
	public void mover3_1UnCirculoEn1_1conRadio2LoLlevaA4_2rr() {
		Punto centro = new Punto(1.0, 1.0);
		Circulo cir = new Circulo(null, centro, 2.0);
		cir.mover(3, 1);
		assertEquals(4, cir.getPosicion().getEjeX(), 0.001);
		assertEquals(2, cir.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void crearUnCuadradoEn1_1ConLado2TieneArea4() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(null, esqInfIzq, 2.0);
		assertEquals(4, cua.calcularArea(), 0.001);
	}

	@Test
	public void crearUnCuadradoEn1_1ConLado2TieneEsquinaDerechaEn3_3() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(null, esqInfIzq, 2.0);
		assertEquals(3, cua.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(3, cua.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnCuadradoEn1_1LoLlevaA_3_1() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(null, esqInfIzq, 2.0);
		cua.mover(3, 1);
		assertEquals(4, cua.getPosicion().getEjeX(), 0.001);
		assertEquals(2, cua.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnCuadradoEn1_1ConLado2ColocaEsqSupDerEn_6_4() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(null, esqInfIzq, 2.0);
		cua.mover(3, 1);
		assertEquals(6, cua.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(4, cua.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void testColeccionOrdenada() {
		Punto centro = new Punto(1.0, 1.0);
		Elipse eli = new Elipse(null, centro, 2, 1);

		Punto esquinaInferiorIzquierda = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(null, esquinaInferiorIzquierda, 2.0, 1.1);

		List<Figura> lista = new ArrayList<Figura>();

		lista.add(eli);
		lista.add(rec);
		
		//Collections.sort(lista); //  ordena los elementos presentes en la lista especificada de Colecci�n en orden ascendente

		List<Figura> listaEsperada = new ArrayList<Figura>();
		listaEsperada.add(rec);
		listaEsperada.add(eli);

		assertEquals(listaEsperada, lista);

	}

}
