package reproductorDeMusica;

public class Playlist {

	private String nombre;
	// private Cancion[] cancion;
	// private ArrayList<Cancion> canciones = new ArrayList<>();

	private Integer cantidadDeCanciones = 50;
	private Cancion[] listado;

	public Playlist(String nombre) {
		this.nombre = nombre;
		this.listado = new Cancion[cantidadDeCanciones];
	}

	public Playlist() {
		// TODO Auto-generated constructor stub
	}

	public Boolean agregarCancion(Cancion nuevaCancion) {
		boolean sePudoAgregar = false;
		for (int i = 0; i < cantidadDeCanciones; i++) {
			if (listado[i].getNombre().equals(nuevaCancion.getNombre())) {
				sePudoAgregar = false;
			}
			if (listado[i] == null) {
				listado[i] = nuevaCancion;
				cantidadDeCanciones++;
				sePudoAgregar = true;
			}
		}
		return sePudoAgregar;
//		boolean ok = false;
//		if(canciones.size() < cantidadDeCanciones) {
//			this.canciones.add(nuevaCancion);
//			ok = true;
//		}
//		return ok;

	}

	public Boolean eliminarCancion(Cancion nombreCancionEliminada) {
		Boolean sePudoEliminar = false;
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] == nombreCancionEliminada) {
				for (int j = i; j < listado.length - 1; j++) {
					listado[j] = listado[j + 1];
				}
				listado[listado.length - 1] = nombreCancionEliminada;
				// pero ???????????????????????????????????????????????????????????????????
				sePudoEliminar = true;
			}
		}
		return sePudoEliminar;
	}

	@Override
	public String toString() {
		return "Playlist [nombre=" + getNombre() + ", cantidad de canciones=" + getCantidadDeCanciones() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeCanciones() {
		return cantidadDeCanciones;
	}

	public void setCantidadDeCanciones(int cantidadDeCanciones) {
		this.cantidadDeCanciones = cantidadDeCanciones;
	}

}
