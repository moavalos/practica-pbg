package callcenter;

public class Contacto {

	private String nombre;
	private String apellido;
	private Integer celular;
	private String email;
	private String direccion;
	private String codigo;
	private String localidad;
	private Provincia provincia;
	private Boolean esCliente = false;

	private Llamada llamadasRecibidas[];
	private Integer cantLlamadasRecibidas;

	public Contacto(String nombre, String apellido, Integer celular, String email, String direccion, String codigo,
			String localidad, Provincia provincia, Boolean esCliente) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.codigo = codigo;
		this.localidad = localidad;
		this.provincia = provincia;
		this.esCliente = true;
		this.cantLlamadasRecibidas = 0;
		this.llamadasRecibidas = new Llamada[100];
	}

	public Boolean esEmailValido(String eMail) {
		/*
		 * Integer arroba = 0; boolean punto = false; String email = ""; for (int i = 0;
		 * i < email.length(); i++) { if (email.charAt(i) == '@' && email.charAt(i) ==
		 * '.') { arroba++; punto = true; } } if (arroba == 1 && punto == true &&
		 * email.equals(eMail)) return email; return email;
		 */
		if (eMail.contains("@") && eMail.contains(".")) 
			return true;
		
		return false;
	}

	public void registrarNuevaLlamada(Llamada nueva) {
		llamadasRecibidas[cantLlamadasRecibidas++] = nueva;
		/*
		 * for (int i = 0; i < llamadasRecibidas.length; i++) { if (llamadasRecibidas[i]
		 * == null) { llamadasRecibidas[i] = nueva; return true; } } return false;
		 */
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + ", email=" + email
				+ ", direccion=" + direccion + ", codigo=" + codigo + ", localidad=" + localidad + ", provincia="
				+ provincia + ", esCliente=" + esCliente + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Integer getCantLlamadasRecibidas() {
		return cantLlamadasRecibidas;
	}

	public void setLlamadasRecibidas(Llamada[] llamadasRecibidas) {
		this.llamadasRecibidas = llamadasRecibidas;
	}

	/*
	 * Cuando el operador del callcenter ingresa a la aplicación, debe seleccionar
	 * “Realizar nueva llamada”. En ese momento el sistema debe “buscarAlCandidato”
	 * y mostrar por pantalla los datos de este. Para determinar qué contacto
	 * llamar, el sistema debe seleccionar aleatoriamente un contacto que cumpla con
	 * las siguientes condiciones: 1. El contacto NO debe ser cliente aún. 2. El
	 * contacto desea ser llamado o al menos no informó lo contrario. 3. El código
	 * postal del contacto debe existir en las zonas de cobertura existente. Una vez
	 * que el operador realiza la llamada debe registrar la misma: a. Si la llamada
	 * fue exitosa (en ese caso el contacto pasa a ser cliente, y no se lo debe
	 * volver a llamar). b. Si el contacto no desea ser llamado nuevamente (la
	 * llamada pudo no haber sido exitosa, pero se haga un nuevo intento en el
	 * futuro). Observaciones: Texto libre donde el operador deja registro de lo
	 * conversado.
	 */

}
