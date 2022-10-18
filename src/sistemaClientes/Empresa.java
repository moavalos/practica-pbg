package sistemaClientes;

import java.util.HashMap;
import java.util.HashSet;

public class Empresa {
	private String nombre;
	private Integer CantidadAbonados = 0;
	private HashSet<Cliente> clientes;
	private HashMap<String, Cliente> clientesPrimium;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.clientes = new HashSet<Cliente>();
		this.clientesPrimium = new HashMap<String, Cliente>();
	}

	public Boolean agregarCliente(Cliente cliente) {
		if (this.clientes.add(cliente)) {
			this.CantidadAbonados++;

			return true;
		}
		return false;

	}

	public Integer getCantidadAbonados() {
		return CantidadAbonados;
	}

	public void setCantidadAbonados(Integer cantidadAbonados) {
		CantidadAbonados = cantidadAbonados;
	}

	public boolean habilitarPremium(String clave, Cliente cliente) throws NoEsClienteConCableException {
		if (cliente instanceof ClienteCable || cliente instanceof ClienteTri) {
			this.clientesPrimium.put(clave, cliente);
			return true;
		} else {
			throw new NoEsClienteConCableException();
		}

	}
}
