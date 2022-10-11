package figurasGeometricas;

public class Punto {

	private Double ejeX;
	private Double ejeY;

	public Punto(Double ejeY, Double ejeX) {
		this.ejeX = ejeX;
		this.ejeY = ejeY;
		// this.setEjeX(ejeX);n 
		// this.setEjeY(ejeY);
	}

	public Double getEjeX() {
		return ejeX;
	}

	public void setEjeX(Double ejeX) {
		this.ejeX = ejeX;
	}

	public Double getEjeY() {
		return ejeY;
	}

	public void setEjeY(Double ejeY) {
		this.ejeY = ejeY;
	}

}
