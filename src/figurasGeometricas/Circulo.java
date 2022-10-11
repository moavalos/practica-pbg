package figurasGeometricas;

public class Circulo extends Elipse{

	private String nombre;
	private String color;
	private Double radio;

	public Circulo(String nombre, Punto posicion, Double radio, Double radio2) {
		super(nombre, posicion, radio, radio);
		// TODO Auto-generated constructor stub
	}

	public Circulo(String nombre, String color, Punto posicion, Double radio, Double radio2) {
		super(nombre, posicion, radio, radio);
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(String nombre, Punto posicion, Double radio) {
		super(nombre, posicion, radio, radio);
	}

	@Override
	public Double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
