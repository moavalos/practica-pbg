package testEmpresaPerseverancia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import empresaPerseverancia.EmpleadoPlantaPermanente;
import empresaPerseverancia.EmpleadoPlantaTemporaria;
import empresaPerseverancia.Empresa;
import empresaPerseverancia.Gerente;

public class TestEmpresa {
	// todos dan verdes por el momento

	@Test

	public void queSePuedaCrearUnaEmpresa() {
		Integer cuit = 1;
		String razonSocial = "";
		Empresa laPerseverancia = new Empresa(cuit, razonSocial);
	}

	@Test
	public void testEmpleadoPlantaTemporaria() {
		/*
		 * Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin
		 * hijos.
		 */
		EmpleadoPlantaTemporaria empleado = new EmpleadoPlantaTemporaria();
		empleado.setHorasTrabajadas(80);
		empleado.setEsCasado(true);
		empleado.setHijos(0);
		Double valorEsperado = 16100.00;
		assertEquals(valorEsperado, empleado.getMonto());
	}

	@Test
	public void testEmpleadoPlantaPermanente_noGerente() {
		/*
		 * Un empleado de Planta Permanente (que no sea gerente) con 80 horas
		 * trabajadas, con esposa, 2 hijos y 6 años de antigüedad.
		 */
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente();
		empleado.setHorasTrabajadas(80);
		empleado.setEsCasado(true);
		empleado.setHijos(2);
		empleado.setAntiguedad(6);
		Double valorEsperado = 25100.00;
		assertEquals(valorEsperado, empleado.getMonto());

	}

	@Test
	public void testEmpleadoPlantaPermanente_noGerente2() {
		/*
		 * Un empleado de Planta Permanente (que no sea gerente) con 160 horas
		 * trabajadas, sin esposa, sin hijos y con 4 años de antigüedad.
		 */
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente();
		empleado = new EmpleadoPlantaPermanente();
		empleado.setHorasTrabajadas(160);
		empleado.setEsCasado(false);
		empleado.setHijos(0);
		empleado.setAntiguedad(4);
		Double valorEsperado = 48400.00;
		assertEquals(valorEsperado, empleado.getMonto(), 0.0);
	}

	@Test
	public void testEmpleadoPlantaPermanente_Gerente() {
		/*
		 * Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de
		 * antigüedad.
		 */
		Gerente empleado = new Gerente();
		empleado.setHorasTrabajadas(160);
		empleado.setEsCasado(true);
		empleado.setHijos(1);
		empleado.setAntiguedad(10);
		Double valorEsperado = 65800.00;
		assertEquals(valorEsperado, empleado.getMonto(), 0.0);

	}

	@Test
	public void testTotalEsperadoParaEmpresa() {
		/*
		 * Una empresa, con el CUIT y Razón Social que desee, y con los cuatro empleados
		 * de los escenarios anteriores
		 */
		Empresa empresita = new Empresa(335566778, "nose");
		empresita.setCuit(335566778);
		empresita.setRazonSocial("Nueva Razon Social");

		EmpleadoPlantaTemporaria empleado = new EmpleadoPlantaTemporaria();
		empleado.setHorasTrabajadas(80);
		empleado.setEsCasado(true);
		empleado.setHijos(0);

		empresita.agregarEmpleado(empleado);

		EmpleadoPlantaPermanente empleado2 = new EmpleadoPlantaPermanente();
		empleado2.setHorasTrabajadas(80);
		empleado2.setEsCasado(true);
		empleado2.setHijos(2);
		empleado2.setAntiguedad(6);
		empresita.agregarEmpleado(empleado2);

		EmpleadoPlantaPermanente empleado3 = new EmpleadoPlantaPermanente();
		empleado3.setHorasTrabajadas(160);
		empleado3.setEsCasado(false);
		empleado3.setHijos(0);
		empleado3.setAntiguedad(4);
		empresita.agregarEmpleado(empleado3);

		Gerente empleado4 = new Gerente();
		empleado4.setHorasTrabajadas(160);
		empleado4.setEsCasado(true);
		empleado4.setHijos(1);
		empleado4.setAntiguedad(10);
		empresita.agregarEmpleado(empleado4);
		
		Double valorEsperado = 155400.00;
		assertEquals(valorEsperado, empresita.obtenerMontoTotal());

	}
}
