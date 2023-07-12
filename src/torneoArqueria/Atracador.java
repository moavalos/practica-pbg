package torneoArqueria;

public class Atracador extends Persona {

	private String apodo;
	private Banda banda;

	public Atracador(Integer dni, String nombre, String apellido, String apodo, Banda banda) {
		super(dni, nombre, apellido);
		this.apodo = apodo;
		this.banda = banda;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

}
