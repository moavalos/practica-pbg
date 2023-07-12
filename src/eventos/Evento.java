package eventos;

import java.util.ArrayList;
import java.util.List;

public class Evento {

	private String nombre;
	private Usuario organizador;
	private List<Usuario> invitados;
	private List<Agasajado> agasajados;

	public Evento(String nombre) {
		this.nombre = nombre;
		this.invitados = new ArrayList<>();
		this.agasajados = new ArrayList<>();
	}

	public List<Usuario> getInvitados() {
		return invitados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}

	public void addInvitado(Usuario invitado) {
		invitados.add(invitado);

	}

	public void add(Agasajado agasajado) {
		agasajados.add(agasajado);
	}

	public List<Agasajado> getAgasajados() {
		return agasajados;
	}

}
