package billeteras;

import java.util.Collection;
import java.util.Set;

public class Billetera implements Pagadora, Transferible {

	private String nombre;
	private Set<Comercio> listaConsumidores;
	private Set<Comercio> listaComercios;
	private Set<Comercio> listaMediosDePago;
	private Set<Compra> listaCompras;
	Set<Comercio> listado;

	public Billetera(String nombre) {
		this.nombre = nombre;
	}

	public void agregarConsumidor(Consumidor nuevoConsumidor) {
		this.listaConsumidores.addAll((Collection<? extends Comercio>) nuevoConsumidor);
	}

	public void agregarComercio(Comercio nuevoComercio) {
		this.listaComercios.add(nuevoComercio);
	}

	public void agregarMedioDePago(Integer dni, CuentaBancaria cb) {
		this.listaMediosDePago.add(null);

	}

	public Boolean agregarMedioDePago(Integer dni, CuentaVirtual cv) {
		return null;

	}

	public Boolean agregarMedioDePago(Integer dni, TarjetaDeCredito tc) {
		return null;

	}

	public Boolean agregarMedioDePago(Integer dni, TarjetaDeDebito td) {
		return null;

	}

	public Boolean pagar(Compra nuevaCompra, MedioPagador nuevoMP) {
		nuevaCompra.setCompraSaldada(true);
		return true;
	}

	public void generarCodigoQR(Long cuitComercio, Double importe) {
		Compra compraConQR = new Compra(cuitComercio, importe);
	}

	public Integer getCantidadDeComercios() {
		this.listaComercios = listado;
		Integer contadorComercios = 0;

		for (Comercio actual : listado) {
			contadorComercios++;
		}
		return contadorComercios;
	}

	public Integer getCantidadDeConsumidores() {
		this.listaConsumidores = listado;
		Integer contadorConsumidores = 0;

		for (Comercio actual : listado) {
			contadorConsumidores++;
		}
		return contadorConsumidores;
	}

	public Integer getCantidadDeMediosDePago() {
		this.listaMediosDePago = listado;
		Integer contadorMP = 0;

		for (Comercio actual : listado) {
			contadorMP++;
		}
		return contadorMP;
	}

	{

	}

	@Override
	public Boolean transferir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean pagar() {
		// TODO Auto-generated method stub
		return null;
	}
}
