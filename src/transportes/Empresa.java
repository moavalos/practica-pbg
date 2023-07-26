package transportes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
	        if (viajes.containsKey(numeroViaje)) {
	            Viaje viaje = viajes.get(numeroViaje);
	            if (viaje instanceof TransportePasajero) {
	                TransportePasajeros transportePasajeros = (TransportePasajeros) viaje;
	                if (transportePasajeros.admitePasajero(pasajero)) {
	                    // Crear un nuevo TicketPasajero y agregarlo al conjunto de tickets.
	                    TicketPasajero ticketPasajero = new TicketPasajero(pasajero, transportePasajeros);
	                    if (tickets == null) {
	                        tickets = new HashSet<>();
	                    }
	                    tickets.add(ticketPasajero);
	                } else {
	                    throw new CantidadPasajeroSobrepasadaException("Se ha superado la cantidad máxima de pasajeros permitidos en el medio de transporte.");
	                }
	            } else {
	                throw new TipoTicketInvalidoException("El viaje no admite tickets de pasajero.");
	            }
	        } else {
	            throw new IllegalArgumentException("El número de viaje especificado no existe.");
	        }
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
