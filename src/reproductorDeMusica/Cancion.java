package reproductorDeMusica;

public class Cancion {

	private String nombre;
	private String genero;
	private Double duracionSegundos;
	private String artista;

	public Cancion(String nombre, String genero, Double duracionSegundos, String artista) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracionSegundos = duracionSegundos;
		this.artista = artista;
	}

	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public Double getDuracionSegundos() {
		return duracionSegundos;
	}

	public String getArtista() {
		return artista;
	}

	@Override
	public String toString() {
		return "Cancion [nombre = " + nombre + ", genero = " + genero + ", duracionSegundos = " + duracionSegundos
				+ ", artista = " + artista + "]";
	}

}
