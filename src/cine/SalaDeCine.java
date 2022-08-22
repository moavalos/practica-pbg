package cine;

public class SalaDeCine {
	
	private Integer[] butacas;
	private Integer[] filas;

	public SalaDeCine(Integer butacas, Integer filas) {
		this.butacas = new Integer[210];
		this.filas = new Integer[15]; // en cada fila entran 14 butacas
	}

	// 2
	public Boolean butacaOcupada(Integer fila, Integer asiento) {
		return true;
	}

	// 3
	public void ocuparButaca(Integer fila, Integer asiento) {
		// ocupar una butaca si no esta ocupada

	}

	// 4
	public Integer cantidadTotalButacasOcupadas() {
		return 0;
	}

	// 5
	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		// consultar si es posible acomodar a un grupo de x personas, en forma contigua
		return true;
	}
}
