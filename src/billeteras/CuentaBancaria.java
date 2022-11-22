package billeteras;

public class CuentaBancaria implements Transferible {
	private String cbu;
	private String entidad;
	private String titular;

	public CuentaBancaria(String cbu, String entidad, String titular) {
		this.cbu = cbu;
		this.entidad = entidad;
		this.titular = titular;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public Boolean transferir() {
		// TODO Auto-generated method stub
		return null;
	}

}
