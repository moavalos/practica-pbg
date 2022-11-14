package videoClub;

public class Videojuego extends Alquilable{
	
	private TipoDeConsola tipo;
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {
		super(codigo, descripcion);
		this.tipo = tipo;
	}

	public TipoDeConsola getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeConsola tipo) {
		this.tipo = tipo;
	}
	

}
