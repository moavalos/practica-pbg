package supermercado;

public class Remera extends Indumentaria {
	
	private String talleRemera;

	public Remera(Integer numero, String descripcion, String talleRemera, String marca, String color, Double precio) {
		super(numero, descripcion, marca, color, precio);
		this.talleRemera = talleRemera;
	}

	public String getTalleRemera() {
		return talleRemera;
	}

	public void setTalleRemera(String talleRemera) {
		this.talleRemera = talleRemera;
	}
	

}
