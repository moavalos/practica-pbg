package cine;

public class SalaDeCine {

	// private Integer columnas;
	// private Integer filas;
	private Butaca asientos[][];
	private boolean[][] sala;

	public SalaDeCine(Integer butacas, Integer filas) {
		/*
		 * this.butacas = new Integer[210]; this.filas = new Integer[15]; // en cada
		 * fila entran 14 butacas
		 */
		// this.columnas = 14; // 210 butacas
		// this.filas = 15;
		// this.asientos = new Butaca[10][10];
		this.sala = new boolean[filas][butacas / filas];
	}

	public Boolean butacaOcupada(Integer fila, Integer asiento) {
		// return asientos[fila][columna] != null;
		return this.sala[fila][asiento];
		/*
		 * Boolean desocupado = false; for (int i = 0; i < asientos.length; i++) { for
		 * (int j = 0; j < asientos[0].length; j++) { if (asientos[columna][fila] ==
		 * null) { desocupado = true; } } } return desocupado;
		 */
	}

	public void ocuparButaca(Integer fila, Integer asiento) {
		// ocupar una butaca si no esta ocupada
		/*
		 * for (int i = 0; i < asientos.length; i++) { if (butacaOcupada(fila, columna))
		 * { // for (int j = 1; j < asientos[0].length; j++) { // for para saber las
		 * columnas asientos[fila][columna] = butaca; } }
		 */
		if (!sala[fila][asiento])
			sala[fila][asiento] = true;
		else
			System.err.print("La butaca está ocupada");

	}

	public Integer cantidadButacasOcupadas() {
		int cantidad = 0;
		for (int i = 0; i < sala.length; i++)
			for (int j = 0; j < sala[i].length; j++)
				if (sala[i][j] == true)
					cantidad++;
		return cantidad;
	}

	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		// consultar si es posible acomodar a un grupo de x personas, en forma contigua
		int fila = 0;
		boolean hayLugares = false;

		while (!hayLugares && fila < sala.length) {
			hayLugares = hayNlugaresContiguosLibresEnLaFila(fila, cantidadDePersonas);
			fila++;
		}
		return hayLugares;
	}

	public boolean hayNlugaresContiguosLibresEnLaFila(int fila, int cantidadDePersonas) {
		int contadorLugaresLibres = 0;
		int j = 0;
		while (contadorLugaresLibres < cantidadDePersonas && j < sala[fila].length) {

			if (sala[fila][j]) {
				contadorLugaresLibres = 0;
			} else {
				contadorLugaresLibres++;
			}
			j++;
		}
		return (contadorLugaresLibres >= cantidadDePersonas);
	}

	private void venderEntradasPorFila(Integer filaIncompleta, Integer butacaDesde, Integer cantidadDeEntradas) {
		int columnaDeButacaVacia = butacaDesde, entradasVendidas = 0;
		while (columnaDeButacaVacia < asientos[filaIncompleta].length && entradasVendidas < cantidadDeEntradas) {
			Butaca nuevaButaca = new Butaca();
			asientos[filaIncompleta][columnaDeButacaVacia] = nuevaButaca;
			columnaDeButacaVacia++;
			entradasVendidas++;
		}
	}

	/*
	 * public Integer filaDisponible(Integer columna, Integer fila) { Integer
	 * contador = 0; for (int i = 0; i < filas; i++) { if(butacaOcupada(i, fila -
	 * 1)) { contador += 1;
	 * 
	 * } } return contador; }
	 */

	public Boolean hayEspacioParaPrueba(Integer cantidadPersonas) { // ???????????????????????????
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

	private int getFilaIncompleta(Integer paraLaCantidadDeButacas) {
		Integer butacasDisponibles = 0;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				butacasDisponibles = asientos[i][j] == null ? ++butacasDisponibles : butacasDisponibles; // ???????????????????????????
				if (butacasDisponibles == paraLaCantidadDeButacas)
					return i;
			}
		}
		return -1;
	}

	private int getPrimerButacaVacia(Integer filaIncompleta) {
		for (int i = 0; i < asientos[filaIncompleta].length; i++) {
			if (asientos[filaIncompleta][i] == null)
				return i;
		}
		return -1;
	}

	public Butaca[][] getAsientos() {
		return asientos;
	}

}
