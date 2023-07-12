package hechiceria;

public class Hechizo {

	private String nombre;
	
	public Hechizo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void aplicarHechizo(Hechizable objeto) {
		if (getNombre().equals("expelliarmus")) {
			objeto.setEstado("Me desarmaron");
		} else if(getNombre().equals("enormuvus")) {
			objeto.setEstado("Ahora soy más grande");
		}

	}

}
