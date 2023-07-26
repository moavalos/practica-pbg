package torneoArqueria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vigilancia {

	private String nombre;
	private List<Persona> personas;
	private List<Banco> bancos;
	private Map<Integer, Atraco> atracos;

	public Vigilancia(String nombre) {
		this.nombre = nombre;
		this.bancos = new ArrayList<>();
		this.personas = new ArrayList<>();
	}

	public void registrarPersona(Persona persona) throws PersonaDuplicadaException {
		for (Persona p : personas) {
			if (p.getDni().equals(persona.getDni())) {
				throw new PersonaDuplicadaException("Ya existe una persona registrada con el mismo DNI");
			}
		}
		personas.add(persona);
	}

	public void agregarBanco(Banco banco) {
		bancos.add(banco);
	}

	/*
	 * Este Metodo lanza las siguientes Excepciones NoSeEncuentraAtracadorException
	 * BancoNoEncontradoExcecption
	 * 
	 */

	public void registrarAtraco(Integer dniAtracador, Integer idBanco)
			throws NoSeEncuentraAtracadorException, BancoNoEncontradoException {
		Atracador atracador = null;
		Banco banco = null;
		for (Persona persona : personas) {
			if (persona instanceof Atracador && persona.getDni().equals(dniAtracador)) {
				atracador = (Atracador) persona;
			}
		}
		if (atracador == null) {
			throw new NoSeEncuentraAtracadorException("No se encontró el atracador con el DNI especificado");
		}
		for (Banco b : bancos) {
			if (b.getIdBanco().equals(idBanco)) {
				banco = b;
			}
		}
		if (banco == null) {
			throw new BancoNoEncontradoException("No se encontró el banco con el ID especificado");
		}

		Atraco atraco = new Atraco(atracador, banco);
		atracos.put(dniAtracador, atraco);

	}

	public Atraco buscarAtracoPorClave(Integer claveAtraco) throws ClaveInexistenteException {
		if (!atracos.containsKey(claveAtraco))
			throw new ClaveInexistenteException("La clave especificada no existe");

		return atracos.get(claveAtraco);
	}

	public Vigilante obtenerElVigiladorDeUnAtraco(Integer claveAtraco) throws ClaveInexistenteException {
		if (!atracos.containsKey(claveAtraco)) {
			throw new ClaveInexistenteException("La clave especificada no existe");
		}

		Atraco atraco = atracos.get(claveAtraco);
		Vigilante vigilante = atraco.getVigilante();

		return vigilante;
	}

	public Set<Atracador> obtenerAtracadoresOrdenados(OrdenPorApodos ordenPorApodo) {
		Set<Atracador> atracadoresOrdenadados = null;
		return atracadoresOrdenadados;
	}

	public Integer getCantidadBancos() {
		return this.bancos.size();
	}

	public Integer getCantidadPersonas() {
		return this.personas.size();
	}

}
