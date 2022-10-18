package sistemaClientes;

public class ClienteBandaAncha extends Cliente {

	private String eMail;

	public ClienteBandaAncha(Integer id, String nombre, String email) {
		this.setId(id);
		this.setNombre(nombre);
		this.eMail = email;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEmail(String email) {
		this.eMail = email;
	}

}
