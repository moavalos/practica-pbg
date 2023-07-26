package transportes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Empresa {

	private String nombre;
	private Map<Integer, Viaje> viajes;
	private Set<Ticket> tickets;

	public Empresa(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Integer, Viaje> getViajes() {
		return viajes;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public void setViajes(Map<Integer, Viaje> viajes) {
		this.viajes = viajes;
	}

	public void registrarViaje(Viaje viaje) {
		Integer proximoNumeroViaje = 0;
		if (viajes == null) {
			viajes = new HashMap<>();
		}
		viajes.put(proximoNumeroViaje, viaje);
		proximoNumeroViaje++;
	}

	/*
	 * Registra Un ticket para carga TicketCarga.class Si el viaje no admite Carga
	 * lanza TipoTicketInvalidoExcption si supera El peso maximo que soporta el
	 * medioTransprte Lanza Una exception CapacidadExcedidaException
	 */

	public void registrarTicketCarga(Integer numeroViaje, Carga carga)
			throws TipoTicketInvalidoException, CapacidadExcedidaException {
	}

	/*
	 * Se registra un TicketPasajero TicketPasajero Si el viaje no admite pasajeros
	 * lanza TipoTicketInvalidoExcption si supera la cantidad de pasajero que
	 * soporta el medioTransprte Lanza Una exception
	 * CantidadPasajeroSobrepasadaException
	 */

	 public void registrarTicketPasajero(Integer numeroViaje, Pasajero pasajero) throws TipoTicketInvalidoException, CantidadPasajeroSobrepasadaException {
	    }

	/*
	 * Se registra un TicketMixto TicketMixto.class si supera la cantidad de
	 * pasajero que soporta el medioTransprte Lanza Una exception
	 * CantidadPasajeroSobrepasadaException si supera El peso maximo que soporta el
	 * medioTransprte Lanza Una exception CapacidadExcedidaException
	 */

	public void registrarTicketMixto(Integer numeroViaje, Pasajero pasajero, Carga carga) {
		// TODO Auto-generated method stub

	}

	/*
	 * retorna la lista de pasajero enforma Descendiente Lanza una exception si el
	 * viaje no existe o si el tipo de viaje No es compatible para trnssporte de
	 * pasajero lanza una exception si el viaje no existe
	 */

	public TreeSet<Pasajero> obtenerListaPasajeroOrdenadosPorDNIDescendiente(Integer numeroViaje) {

		return null;
	}

	public Double obtenerELTotalDeCargaTransportadaEnTodosLosViajes() {

		return null;
	}
}
