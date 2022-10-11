package empresaPerseverancia;

public class EmpleadoPlantaTemporaria extends Empleado {
	
	// no cobra antigüedad y cobra la cantidad de horas trabajadas por $200, más salario familiar.

	@Override
	public Double getValorHora() {
		return 200.00;
	}

	public Double sueldoTotal() {
		return (double) (getValorHora() * super.getHorasTrabajadas() + super.getPlusFamiliar()) ;
	}

}
