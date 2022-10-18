package sistemaClientes;

public class ClienteCable extends Cliente {
	
	private String codigoDecodificador;

	public ClienteCable(Integer id, String nombre, String codigoDecodificador) {
		this.setId(id);
		this.setNombre(nombre);
		this.codigoDecodificador = codigoDecodificador;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}
}
