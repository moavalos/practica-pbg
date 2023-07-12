package eventos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanificadorDeEventos {

	private List<Usuario> usuarios;
	private List<Evento> eventos;
	private Map<Evento, List<Usuario>> invitadosPorEvento;
	private Map<Evento, List<Usuario>> confirmadosPorEvento;

	public PlanificadorDeEventos() {
		this.usuarios = new ArrayList<>();
		this.eventos = new ArrayList<>();
		this.invitadosPorEvento = new HashMap<>();
		this.confirmadosPorEvento = new HashMap<>();
	}

	public void add(Usuario usuario) {
		this.usuarios.add(usuario);

	}

	public Usuario getUsuario(String mailOrganizador) {
		for (Usuario usuario : usuarios)
			if (usuario.getMailOrganizador().equals(mailOrganizador))
				return usuario;

		return null;
	}

	public void crear(Usuario organizador, Evento evento) {
		eventos.add(evento);
		evento.setOrganizador(organizador);
		invitadosPorEvento.put(evento, new ArrayList<>());
		confirmadosPorEvento.put(evento, new ArrayList<>());

	}

	public void invitar(Evento evento, Usuario invitado) {
		List<Usuario> invitados = invitadosPorEvento.get(evento);
		invitados.add(invitado);
	}

	public void confirmar(Evento evento, Usuario invitado) {
		List<Usuario> confirmados = confirmadosPorEvento.get(evento);
		confirmados.add(invitado);
	}

	public Integer getCantidadDeInvitados() {
		Integer cantidad = 0;
		for (List<Usuario> invitados : invitadosPorEvento.values()) {
			cantidad += invitados.size();
		}
		return cantidad;
	}

	public Integer getCantidadDeUsuarios() {
		return this.usuarios.size();
	}

	public Integer getCantidadDeEventos() {
		return this.eventos.size();
	}

	public Integer getCantidadDeCumpleanios() {
		int cantidad = 0;
		for (Evento evento : eventos) {
			if (evento instanceof Cumple) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Integer getCantidadDeInvitadosConfirmados() {
		Integer cantidad = 0;
		for (List<Usuario> confirmados : confirmadosPorEvento.values()) {
			cantidad += confirmados.size();
		}
		return cantidad;
	}

	public Evento getEvento(String nombre) {
		for (Evento evento : eventos) {
			if (evento.getNombre().equals(nombre)) {
				return evento;
			}
		}
		return null;
	}

	public Integer getCantidadDeCasamientos() {
		int cantidad = 0;
		for (Evento evento : eventos) {
			if (evento instanceof Casamiento) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public void crear(Usuario usuario, String nombreDelEvento) {
		eventos.add(new Casamiento(nombreDelEvento));
		eventos.get(eventos.size() - 1).setOrganizador(usuario);

	}

}
