package autopista;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {

	private HashMap<Integer, Vehiculo> telepase = new HashMap<Integer, Vehiculo>();
	private HashSet<Vehiculo> vehiculosEnCirculacion = new HashSet<Vehiculo>();

	public Boolean registrarTelepase(Integer numeroTelpase, Vehiculo vehiculo) {
		this.telepase.put(numeroTelpase, vehiculo);
		return true;
	}

	public Boolean ingresarAutopista(Integer numeroTelepase, Vehiculo vehiculo) throws VehiculoNotFounException {
		if (registrarTelepase(numeroTelepase, vehiculo)) {
			this.vehiculosEnCirculacion.add(vehiculo);
			return true;
		}
		return false;

	}

	public void salirAutpista(Vehiculo vehiculo) throws VehiculoNotFounException {
		// lanza Una exception VehiculoNotFounException si no esta en circulacion
		if (vehiculosEnCirculacion.contains(vehiculo)) {
			vehiculosEnCirculacion.remove(vehiculo);
		}
	}

	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente() {

		return null;
	}

	public Integer cantidadDeVehiculosENCirculacion() {
		return this.vehiculosEnCirculacion.size();
	}

}
