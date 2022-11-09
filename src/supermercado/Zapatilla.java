package supermercado;

public class Zapatilla extends Indumentaria{
	
	private Integer talleZapatilla;

	public Zapatilla(Integer numero, String descripcion, Integer talleZapatilla, String marca, String color, Double precio) {
		super(numero, descripcion, marca, color, precio);
		this.talleZapatilla = talleZapatilla;
	}

	public Integer getTalleZapatilla() {
		return talleZapatilla;
	}

	public void setTalleZapatilla(Integer talleZapatilla) {
		this.talleZapatilla = talleZapatilla;
	}

}
