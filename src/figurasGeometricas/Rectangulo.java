package figurasGeometricas;

public class Rectangulo extends Figura {

	private Punto esquinaSupDer;

	public Rectangulo(String color, Punto posicion, Double ladoMayor, Double ladoMenor) {
		super(color, posicion, ladoMayor, ladoMenor);
		calcularEsqSupDer();

	}

	@Override
	public Double calcularArea() {
		return getLadoMayor() * getLadoMenor();
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Punto getEsquinaSupDer() {
		return esquinaSupDer;
	}

	public void setEsquinaSupDer(Punto esquinaSupDer) {
		esquinaSupDer = esquinaSupDer;
	}

	private void calcularEsqSupDer() {
		double ejeX = getPosicion().getEjeX() + getLadoMayor();
		double ejeY = getPosicion().getEjeY() + getLadoMenor();
		Punto punto = new Punto(ejeX, ejeY);
		this.esquinaSupDer = punto;
	}

	@Override
	public void setPosicion(Punto posicion) {
		super.setPosicion(posicion);
		calcularEsqSupDer();
	}
}
