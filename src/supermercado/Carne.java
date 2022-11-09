package supermercado;

public class Carne extends Comestible {

	private Double kilos;
	private String nombreEmpresa;

	public Carne(Integer numero, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos,
			String nombreEmpresa, Double precio) {
		super(numero, descripcion, fechaDeElaboracion, fechaDeVencimiento, precio);
		this.kilos = kilos;
		this.nombreEmpresa = nombreEmpresa;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
