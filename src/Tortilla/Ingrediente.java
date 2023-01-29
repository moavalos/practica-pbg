package Tortilla;

public class Ingrediente {
	
	private String nombre;
	private Double cantidad;
	private String estadoNatural; // tranquilamente puede ser un enum
	private Boolean cocido;
	private Boolean cascara;
	private Boolean cortado;
	private Boolean batido;
	private Integer temperaturaMaximaParaCadaIngrediente;
	
	public Ingrediente(String nombre, Double cantidad, String estadoNatural, Integer temperaturaMaximaParaCadaIngrediente) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.estadoNatural = estadoNatural;
		this.cocido = false;
		this.cascara = true;
		this.cortado = false;
		this.batido = false;
		this.temperaturaMaximaParaCadaIngrediente = temperaturaMaximaParaCadaIngrediente;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getCocido() {
		return cocido;
	}

	public void setCocido(Boolean cocido) {
		this.cocido = cocido;
	}

	public Boolean getCascara() {
		return cascara;
	}

	public void setCascara(Boolean cascara) {
		this.cascara = cascara;
	}

	public Integer getTemperaturaMaximaParaCadaIngrediente() {
		return temperaturaMaximaParaCadaIngrediente;
	}

	public void setTemperaturaMaximaParaCadaIngrediente(Integer temperaturaMaximaParaCadaIngrediente) {
		this.temperaturaMaximaParaCadaIngrediente = temperaturaMaximaParaCadaIngrediente;
	}

	public String getEstadoNatural() {
		return estadoNatural;
	}

	public void setEstadoNatural(String estadoNatural) {
		this.estadoNatural = estadoNatural;
	}

	public Boolean getCortado() {
		return cortado;
	}

	public void setCortado(Boolean cortado) {
		this.cortado = cortado;
	}

	public Boolean getBatido() {
		return batido;
	}

	public void setBatido(Boolean batido) {
		this.batido = batido;
	}

	
}
