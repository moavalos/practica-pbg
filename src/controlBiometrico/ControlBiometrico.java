package controlBiometrico;

public class ControlBiometrico {

	private String nombre;
	private Usuario usuarios;
	private final Integer REGISTROS;

	public ControlBiometrico(String nombre, Usuario usuarios) {
		this.nombre = nombre;
		this.usuarios = new Usuario();
		this.REGISTROS = 50000;
	}

	public Usuario registrarUsuario() {

	}

	public Usuario obtenerUnUsuarioPorSuNumeroDeUsuario() {

	}

	public Usuario obtenerElUsuarioGerenteDeMayorSueldo() {

	}
	
	public Usuario registrarIngreso() {
		/*Número de usuario.
■ Número entero para el día.
■ Número entero para el mes.
■ Para efectuar el ingreso, se deberá validar que el usuario exista y
que la fecha sea correcta. Este método deberá devolver verdadero
si el ingreso se registró correctamente. Ejemplo de validación de
fecha:
● Fecha correcta: Día: 1 - Mes: 9.
● Fecha incorrecta: Día: 31 - Mes: 2.*/
	}
	
	public

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Integer getREGISTROS() {
		return REGISTROS;
	}

}
