package cyberSecurity;

public abstract class PagoConQR extends TransaccionMonetaria implements Rechazable{

	private Integer codigoQR;
	private Cliente destino;
	
	public PagoConQR(Cliente origen, Dispositivo dispositivo, Cliente destino, Integer codigoQR, Double monto) {
		super(origen, dispositivo, monto);
		this.setCodigoQR(codigoQR);
		this.setDestino(destino);
	}

	public Integer getCodigoQR() {
		return codigoQR;
	}

	public void setCodigoQR(Integer codigoQR) {
		this.codigoQR = codigoQR;
	}

	public Cliente getDestino() {
		return destino;
	}

	public void setDestino(Cliente destino) {
		this.destino = destino;
	}

}
