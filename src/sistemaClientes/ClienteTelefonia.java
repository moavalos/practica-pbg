package sistemaClientes;

public class ClienteTelefonia extends Cliente {
	private String codigoDeArea; 
	private String telefono;
	
	public ClienteTelefonia(Integer id, String nombre, String codigoDeArea, String telefono) {
		setId(id);
		setNombre(nombre);
		this.codigoDeArea = codigoDeArea;
		this.telefono = telefono;
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
