package empresaPerseverancia;

public class Gerente extends EmpleadoPlantaPermanente {

	/*
	 * su hora trabajada vale $400, por antigüedad se le pagan $150 por año,
	 * mientras que el salario familiar es el mismo que el de los empleados de
	 * planta permanente y temporal
	 */
	@Override
	public Double getValorHora() {
		return 400.00;
	}

	@Override
	public Double getCalculoAntiguedad() {
		return getAntiguedad() * 150.00;
	}
}
