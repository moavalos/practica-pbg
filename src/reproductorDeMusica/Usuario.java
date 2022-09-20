package reproductorDeMusica;
public class Usuario {

	private String nombre;
	private Integer edad;
	private Playlist[] miPlaylist;

	private static final int CANT_PLAYLIST = 100;

	public Usuario(String nombre, Integer edad, Playlist miPlaylist) {
		this.nombre = nombre;
		this.edad = edad;
		this.miPlaylist = new Playlist[CANT_PLAYLIST]; // composicion
	}

	public void agregarNuevaPlaylist(String nombrePlaylist) {
		for (int i = 0; i < miPlaylist.length; i++) {
			miPlaylist[i] = new Playlist(nombrePlaylist);
		}
	}

	public String verMiPlaylist() {
		String mostrar = "";
		for (int i = 0; i < this.miPlaylist.length; i++) {
			if (this.miPlaylist[i] == null) {
				// continue;
			}
			mostrar += this.miPlaylist[i].toString() + ",";
		}

		return "My playlist: " + this.getNombre() + ", canciones: " + mostrar + ".";
	}

	public String reproducirPlaylist(int numeroDePlaylist) {
		String hola = "";
		return hola;
		// perdon no tengo ganas, otro dia lo termino
	}

	public Playlist[] getMiPlaylist() {
		return miPlaylist;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		int i = 0;
		return "Usuario [nombre = " + nombre + ", edad = " + edad + " ";

	}
}
