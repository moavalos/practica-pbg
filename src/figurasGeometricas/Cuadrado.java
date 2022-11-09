package figurasGeometricas;

public class Cuadrado extends Rectangulo {

	private String nombre;
	private String color;

	public Cuadrado(String nombre, Punto posicion, Double ladoMayor, Double ladoMenor) {
		super(nombre, posicion, ladoMayor, ladoMayor);
		this.nombre = nombre;
	}

	public Cuadrado(String nombre, String color, Punto posicion, Double ladoMayor, Double ladoMenor) {
		super(color, posicion, ladoMayor, ladoMayor);
		this.nombre = nombre;
		this.color = color;
	}

	public Cuadrado(String color, Punto posicion, Double ladoMayor) {
		super(color, posicion, ladoMayor, ladoMayor);

	}

	@Override
	public Double calcularArea() { // lado mayor = base, lado menor = altura (o al reves)
		return Math.pow(getLadoMayor(), 2);
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
