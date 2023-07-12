package testCentralDeAlarmas;

import static org.junit.Assert.*;

import org.junit.Test;

import centralDeAlarmas.Alarma;
import centralDeAlarmas.CodigoAlarmaIncorrectoException;
import centralDeAlarmas.UsuarioAdmin;

public class tests {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		Integer idAlarma = 123;
		Integer codigoActivacionDesactivacion = 1234;
		String codigoConfiguracion = "4677";
		Alarma a = new Alarma(idAlarma, codigoActivacionDesactivacion, codigoConfiguracion, "fjdkls");
		assertNotNull(a);
	}
	
	@Test
	public void queSePuedaGuardarUnaCategoria() {
		UsuarioAdmin joel = new UsuarioAdmin(584309, "fkdlñs");
		Alarma fdjuksol = new Alarma(1234, 567, "574329", "alarma de joel");
		joel.getAlarmas().add(fdjuksol);
		joel.agregarUsuarioAUnaAlarma(4231, fdjuksol.getIdAlarma(), fdjuksol.getCodigoConfiguracion());
		System.out.println(joel.getAlarmas().get(0).getUsuarios().size());
		assertEquals(1, joel.getAlarmas().get(0).getUsuarios().size());
	}

	@Test
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceCodigoAlarmaIncorrectoException() throws CodigoAlarmaIncorrectoException{

	}

	@Test
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorDuplicadoExceptio() {

	}

	@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() {

	}

	@Test
	public void queParaUnaAlarmaDeterminadaSePuedaObtenerUnaColeccionOrdenadaDeAcccionesesDeTipoConfiguracionOdenadasPorIdDeAccion() {

	}

}
