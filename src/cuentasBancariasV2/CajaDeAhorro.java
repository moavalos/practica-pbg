package cuentasBancariasV2;

public class CajaDeAhorro extends Cuenta{
	
	private Integer retiros;
	
	public CajaDeAhorro(String codigo, Cliente cliente, Double saldo, Integer retiros) {
		super(codigo, cliente, saldo);
		this.retiros = retiros;
	}

	public Integer getRetiros() {
		return retiros;
	}

	public void setRetiros(Integer retiros) {
		this.retiros = retiros;
	}
	
	

}
