package cyberSecurity;

public class TransaccionMonetaria {
private Double monto;
	
	public TransaccionMonetaria(Cliente cliente, Dispositivo dispositivo, Double monto) {
		super(cliente, dispositivo);
		this.setMonto(monto);
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
}
