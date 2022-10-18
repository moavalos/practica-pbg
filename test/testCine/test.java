package testCine;

import org.junit.Test;

import cine.SalaDeCine;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

public class test {
	@Test
	public void ocuparButacasTest() {
		SalaDeCine s = new SalaDeCine(12, 2);
		s.ocuparButaca(0, 1);
		s.ocuparButaca(0, 2);
		s.ocuparButaca(1, 1);
		s.ocuparButaca(1, 2);
		s.ocuparButaca(1, 3);
		
		assertTrue(s.butacaOcupada(0, 2));
		assertTrue(s.butacaOcupada(0, 1));
		assertTrue(s.butacaOcupada(1, 1));
		assertTrue(s.butacaOcupada(1, 2));
		assertTrue(s.butacaOcupada(1, 3));
		//assertEquals(5, s.cantidadButacasOcupadas());
	}
		
	@Test
	public void lugaresContiguosDisponiblesEnFilaTest() {
		SalaDeCine s = new SalaDeCine(12, 2);
		s.ocuparButaca(0, 1);
		s.ocuparButaca(0, 2);
		s.ocuparButaca(1, 1);
		s.ocuparButaca(1, 2);
		s.ocuparButaca(1, 3);
		assertTrue(s.hayNlugaresContiguosLibresEnLaFila(0,3));
		assertFalse(s.hayNlugaresContiguosLibresEnLaFila(1,3));
	}
	
	@Test
	public void lugaresContiguosAlPrincipioDisponiblesEnFilaTest() {
		SalaDeCine s = new SalaDeCine(12, 2);
		s.ocuparButaca(0, 3);
		s.ocuparButaca(0, 4);
		assertTrue(s.hayNlugaresContiguosLibresEnLaFila(0,3));
	}
	
	@Test
	public void lugaresContiguosAlFinalDisponiblesEnFilaTest() {
		SalaDeCine s = new SalaDeCine(12, 2);
		s.ocuparButaca(0, 2);
		assertTrue(s.hayNlugaresContiguosLibresEnLaFila(0,3));
	}
	
	@Test
	public void hayLugaresContiguisEnPrimeraFila() {
		SalaDeCine s = new SalaDeCine(12, 2);
		s.ocuparButaca(0, 1);
		s.ocuparButaca(0, 2);
		s.ocuparButaca(1, 1);
		s.ocuparButaca(1, 2);
		s.ocuparButaca(1, 3);
		assertTrue(s.hayEspacioPara(3));
	
	}
	@Test
	public void hayLugaresContiguisEnUltimaFila() {
		SalaDeCine s = new SalaDeCine(12, 2);
		s.ocuparButaca(0, 1);
		s.ocuparButaca(0, 2);
		s.ocuparButaca(1, 1);
		s.ocuparButaca(1, 2);
		s.ocuparButaca(0, 3);
		assertTrue(s.hayNlugaresContiguosLibresEnLaFila(1,3));
		assertTrue(s.hayEspacioPara(3));
	
	}
	@Test
	public void hayLugaresContiguisEnFilaDelMedio() {
		SalaDeCine s = new SalaDeCine(12, 3);
		s.ocuparButaca(0, 1);
		s.ocuparButaca(0, 2);
		s.ocuparButaca(2, 1);
		s.ocuparButaca(2, 2);
		s.ocuparButaca(2, 3);
		assertTrue(s.hayNlugaresContiguosLibresEnLaFila(1,3));
		assertTrue(s.hayEspacioPara(3));
	
	}
}
