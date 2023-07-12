package hechiceria;

public class Animal implements Hechizable {
	
	private String estado;

	@Override
	public String getEstado() {
		return estado;
	}

	@Override
	public void setEstado(String estado) {
		this.estado = estado;
		
	}

	
	
	
}
