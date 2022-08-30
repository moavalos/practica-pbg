package cine;

public class SalaDeCine {

	private Integer columnas;
	private Integer filas;
	private Integer asientos[][];

	public SalaDeCine() {
		/*
		 * this.butacas = new Integer[210]; this.filas = new Integer[15]; // en cada
		 * fila entran 14 butacas
		 */
		this.columnas = 14; // 210 butacas
		this.filas = 15;
		this.asientos = new Integer[columnas][filas];
	}

	// 2
	public Boolean butacaOcupada(Integer columna, Integer fila) { 
		// esto nos devuelve que esta ocupada
		return asientos[columna][fila] != null;
		/*
		 * Boolean desocupado = false; for (int i = 0; i < asientos.length; i++) { for
		 * (int j = 0; j < asientos[0].length; j++) { if (asientos[columna][fila] ==
		 * null) { desocupado = true; } } } return desocupado;
		 */
	}

	// 3
	public Boolean ocuparButaca(Integer columna, Integer fila) { // esto no anda
		// ocupar una butaca si no esta ocupada
		if (butacaOcupada(columna, fila)) {
			for (int i = 1; i < asientos.length; i++) {
				for (int j = 1; j < asientos[0].length; j++) { // for para saber las columnas
					asientos[columna][fila]++;
					return true;
				}
			}
		}
		return false;

	}

	// 4
	public Integer cantidadTotalButacasOcupadas() {
		Integer bOcup = 0;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				if (asientos[i][j] != null)
					bOcup++;
			}
		}

		return bOcup;
	}

	// 5
	public Boolean hayEspacioPara(Integer cantidadDePersonas, Integer columna, Integer fila) {
		// consultar si es posible acomodar a un grupo de x personas, en forma contigua
		for (int i = 0; i < cantidadDePersonas; i++) {
			if (cantidadTotalButacasOcupadas() < cantidadDePersonas) {
				return true;
			}
		}
		return false; // como chota hago que pregunten por una sola fila????
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

}
