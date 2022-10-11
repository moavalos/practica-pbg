package empresaPerseverancia;

public class EmpleadoPlantaPermanente extends Empleado implements SueldoTotal {

	private Integer antiguedad;

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;

	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	//  más antigüedad ($100 por año de antigüedad)
	public Double getCalculoAntiguedad() {
		return (Double) (getAntiguedad() * 100.00);
	}

	@Override
	public Double getMonto() {
		return super.getMonto() + getCalculoAntiguedad();
	}

	@Override
	//  cobra la cantidad de horas trabajadas por $300
	public Double getValorHora() {
		return 300.00;
	}

	@Override
	public Double sueldoTotal() {
		// se suma salario familiar
		return (double) (getValorHora() * super.getHorasTrabajadas() + getAntiguedad() * getCalculoAntiguedad() + super.getPlusFamiliar());
	}
}
