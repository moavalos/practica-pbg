package biblioteca;

public class Libro {
	
	private Integer longitud;
	private String apellidoAutor;
	private String titulo;
	private String fechaPublicacion;

	public Libro(Integer longitud, String apellidoAutor, String titulo, String fechaPublicacion) {
		this.longitud = longitud;
		this.apellidoAutor = apellidoAutor;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getApellidoAutor() {
		return apellidoAutor;
	}

	public void setApellidoAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	

}
