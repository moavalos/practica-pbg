package cine;

public class SalaDeCine {

	private Integer columnas;
	private Integer filas;
	private Integer asientos[][];

	public SalaDeCine() {
		/*
		 * this.butacas = new Integer[210];
		 * this.filas = new Integer[15]; // en cada fila entran 14 butacas
		 */
		this.columnas = 14; // 210 butacas
		this.filas = 15;
		this.asientos = new Integer[columnas][filas];
	}

	// 2
	public Boolean butacaOcupada(Integer columna, Integer fila) {
		// esto devuelve true si la butaca esta disponible/desocupada.
		Boolean desocupado = false;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
				if (asientos[i][j] == null) {
					desocupado = true;
				}
			}
		}
		return desocupado;
	}
	
	public Boolean ocuparButacaPrueba(Integer columna, Integer fila) {
		if(butacaOcupada(columna-1, fila-1)) {
			asientos[columna-1][fila-1] = 1;
			return true;
		}
		return false;
	}

	// 3
	public void ocuparButaca(Integer columna, Integer fila) {
		// ocupar una butaca si no esta ocupada
		if (!butacaOcupada(columna, fila)) {
			for (int i = 0; i < asientos.length; i++) {
				for (int j = 0; j < asientos[0].length; j++) { // for para saber las columnas
				}
			}
		}

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
