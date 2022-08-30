package cine;

public class SalaDeCine {

	//private Integer columnas;
	//private Integer filas;
	private Butaca asientos[][];

	public SalaDeCine() {
		/*
		 * this.butacas = new Integer[210]; this.filas = new Integer[15]; // en cada
		 * fila entran 14 butacas
		 */
		//this.columnas = 14; // 210 butacas
		//this.filas = 15;
		this.asientos = new Butaca[10][10];
	}

	public Boolean butacaOcupada(Integer fila, Integer columna) { 
		return asientos[fila][columna] != null;
		/*
		 * Boolean desocupado = false; for (int i = 0; i < asientos.length; i++) { for
		 * (int j = 0; j < asientos[0].length; j++) { if (asientos[columna][fila] ==
		 * null) { desocupado = true; } } } return desocupado;
		 */
	}

	public void ocuparButaca(Integer fila, Integer columna, Butaca butaca) { 
		// ocupar una butaca si no esta ocupada
			for (int i = 0; i < asientos.length; i++) {
				if (butacaOcupada(fila, columna)) {
				//for (int j = 1; j < asientos[0].length; j++) { // for para saber las columnas
					asientos[fila][columna] = butaca;
			}
		}

	}

	public Integer cantidadButacasOcupadas() {
		Integer butacasOcupadas = 0;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				if (asientos[i][j] != null)
					butacasOcupadas++;
			}
		}

		return butacasOcupadas;
	}

	public Boolean hayEspacioPara(Integer cantidadDePersonas, Integer columna, Integer fila) {
		// consultar si es posible acomodar a un grupo de x personas, en forma contigua
		for (int i = 0; i < cantidadDePersonas; i++) {
			if (cantidadButacasOcupadas() < cantidadDePersonas) {
				return true;
			}
		}
		return false;
	}

	/*
	 * public Integer filaDisponible(Integer columna, Integer fila) { Integer
	 * contador = 0; for (int i = 0; i < filas; i++) { if(butacaOcupada(i, fila -
	 * 1)) { contador += 1;
	 * 
	 * } } return contador; }
	 */

	public Boolean hayEspacioParaPrueba(int cantidadPersonas) {
		Integer lugaresEnFila = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (i > 0)
				lugaresEnFila = 0;
			for (int j = 0; j < asientos[i].length; j++) {
				lugaresEnFila = asientos[i][j] == null ? ++lugaresEnFila : lugaresEnFila;
				if (lugaresEnFila == cantidadPersonas)
					return true;
			}
		}
		return false;
	}

	public void butacasDisponibles() {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				if (asientos[i][j] == null)
					System.out.print("L ");
				else
					System.out.print("O ");
			}
			System.out.println();
		}
	}

	public Butaca[][] getAsientos() {
		return asientos;
	}

}
