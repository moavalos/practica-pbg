package biblioteca;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

	private String nombreDelLibro;
	private String nombreDelAutor;
	private Genero genero;
	private Integer cantidadDeCaracteresDelLibro;
	private Integer añoDePublicacion;
	private Boolean fueComprado;
	public Integer cantidadDeVecesComprado;

	public Libro(String nombreDelLibro, String nombreDelAutor, Genero genero, Integer añoDePublicacion) {
		this.nombreDelLibro = nombreDelLibro;
		this.nombreDelAutor = nombreDelAutor;
		this.genero = genero;
		this.cantidadDeCaracteresDelLibro = this.nombreDelLibro.length();
		this.añoDePublicacion = añoDePublicacion;
		this.fueComprado = false;
		this.cantidadDeVecesComprado = 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreDelAutor, nombreDelLibro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(nombreDelAutor, other.nombreDelAutor)
				&& Objects.equals(nombreDelLibro, other.nombreDelLibro);
	}

	public Genero getGenero() {
		return genero;
	}

	public String getNombreDelLibro() {
		return nombreDelLibro;
	}

	@Override
	public int compareTo(Libro otroLibro) {
		return this.nombreDelAutor.compareTo(otroLibro.nombreDelAutor);
	}

	public String getNombreDelAutor() {
		return nombreDelAutor;
	}

	public Integer getCantidadDeCaracteresDelLibro() {
		return cantidadDeCaracteresDelLibro;
	}

	public Integer getAñoDePublicacion() {
		return añoDePublicacion;
	}

	public void setFueComprado(Boolean fueComprado) {
		this.fueComprado = fueComprado;
	}

	public Integer getCantidadDeVecesComprado() {
		return cantidadDeVecesComprado;
	}

	public Boolean getFueComprado() {
		return fueComprado;
	}

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
