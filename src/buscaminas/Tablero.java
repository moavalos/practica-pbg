package buscaminas;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Tablero {

	private Casilla[][] casillas;
	private Integer filas;
	private Integer columnas;
	private Integer minas;
	private Integer numCasillasAbiertas;
	private Boolean juegoTerminado;
	private Consumer<List<Casilla>> eventoPartidaPerdida;
	private Consumer<List<Casilla>> eventoPartidaGanada;
	private Consumer<Casilla> eventoCasillaAbierta;

	public Tablero(Integer filas, Integer columnas, Integer minas) {
		this.filas = filas;
		this.columnas = columnas;
		this.minas = minas;
		inicializarCasilla();
	}

	public void inicializarCasilla() {
		casillas = new Casilla[filas][columnas];
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				casillas[i][j] = new Casilla(i, j, false);
			}
		}
		generarMinas();
	}

	public void generarMinas() {
		Integer minasGeneradas = 0;
		while (minasGeneradas != minas) {
			Integer posicionFila = (int) (Math.random() * casillas.length);
			Integer posicionColumna = (int) (Math.random() * casillas[0].length);
			if (!casillas[posicionFila][posicionColumna].getMina()) {
				casillas[posicionFila][posicionColumna].setMina(true);
				minasGeneradas++;
			}
		}
		actualizarNumeroMinasAlrededor();

	}

	public void actualizarNumeroMinasAlrededor() {
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				if (casillas[i][j].getMina()) {
					List<Casilla> casillasAlrededor = obtenerCasillasAlrededor(i, j);
					casillasAlrededor.forEach((c) -> c.incrementarMinasAlrededor());
				}
			}
		}
	}

	public List<Casilla> obtenerCasillasAlrededor(Integer posicionFila, Integer posicionColumna) {
		List<Casilla> listaCasillas = new LinkedList<>();
		for (int i = 0; i < 8; i++) {
			Integer posicionfila = posicionFila;
			Integer posicioncolumna = posicionColumna;
			switch (i) {
			case 0: // arriba
				posicionfila--;
				break;
			case 1: // arriba derecha
				posicionfila--;
				posicioncolumna++;
				break;
			case 2: // derecha
				posicioncolumna++;
				break;
			case 3: // derecha abajo
				posicioncolumna++;
				posicionfila++;
				break;
			case 4: // abajo
				posicionfila++;
				break;
			case 5: // abajo izquierda
				posicionfila++;
				posicioncolumna--;
				break;
			case 6: // izquierda
				posicioncolumna--;
				break;
			case 7: // izquierda arriba
				posicionfila--;
				posicioncolumna--;
				break;

			default:
				break;
			}
			if (posicionfila >= 0 && posicionfila < this.casillas.length && posicioncolumna >= 0
					&& posicioncolumna < this.casillas[0].length) {
				listaCasillas.add(casillas[posicionfila][posicioncolumna]);
			}
		}
		return listaCasillas;
	}

	List<Casilla> obtenerCasillasConMinas() {
		List<Casilla> casillasConMinas = new LinkedList<>();
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				if (casillas[i][j].getMina()) {
					casillasConMinas.add(casillas[i][j]);
				}
			}
		}
		return casillasConMinas;
	}

	public void seleccionarCasilla(int posFila, int posColumna) {
		eventoCasillaAbierta.accept(this.casillas[posFila][posColumna]);
		if (this.casillas[posFila][posColumna].getMina()) {
			eventoPartidaPerdida.accept(obtenerCasillasConMinas());
		} else if (this.casillas[posFila][posColumna].getNumeroMinasAlrededor() == 0) {
			marcarCasillaAbierta(posFila, posColumna);
			List<Casilla> casillasAlrededor = obtenerCasillasAlrededor(posFila, posColumna);
			for (Casilla casilla : casillasAlrededor) {
				if (!casilla.isAbierta()) {
					seleccionarCasilla(casilla.getPosicionFila(), casilla.getPosicionColumna());
				}
			}
		} else {
			marcarCasillaAbierta(posFila, posColumna);
		}
		if (partidaGanada()) {
			eventoPartidaGanada.accept(obtenerCasillasConMinas());
		}
	}

	public Boolean partidaGanada() {
		return numCasillasAbiertas >= (filas * columnas) - minas;
	}

	public void marcarCasillaAbierta(int posFila, int posColumna) {
		if (!this.casillas[posFila][posColumna].isAbierta()) {
			numCasillasAbiertas++;
			this.casillas[posFila][posColumna].setAbierta(true);
		}
	}

	public void imprimirTablero() {
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				System.out.print(casillas[i][j].getMina() ? "+" : "0");
			}
			System.out.println(" ");
		}
	}

	public void imprimirPistas() {
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				System.out.print(casillas[i][j].getNumeroMinasAlrededor());
			}
			System.out.println(" ");
		}
	}

	public void setEventoPartidaPerdida(Consumer<List<Casilla>> eventoPartidaPerdida) {
		this.eventoPartidaPerdida = eventoPartidaPerdida;
	}

	public void setEventoCasillaAbierta(Consumer<Casilla> eventoCasillaAbierta) {
		this.eventoCasillaAbierta = eventoCasillaAbierta;
	}

	public void setEventoPartidaGanada(Consumer<List<Casilla>> eventoPartidaGanada) {
		this.eventoPartidaGanada = eventoPartidaGanada;
	}

}
