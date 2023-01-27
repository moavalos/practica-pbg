package operacionesBlockbuster;

public class Videojuego extends Alquilable{
	
	private TipoDeConsola tipoConsola;
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipoConsola) {
		super(codigo, descripcion);
		this.tipoConsola = tipoConsola;
	}

	public TipoDeConsola getTipoConsola() {
		return tipoConsola;
	}

	public void setTipoConsola(TipoDeConsola tipoConsola) {
		this.tipoConsola = tipoConsola;
	}
	
	

}
