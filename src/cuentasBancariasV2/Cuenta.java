package cuentasBancariasV2;

public class Cuenta {
	
	private String codigo;
	private Cliente cliente;
	private Double saldo;
	
	public Cuenta(String codigo, Cliente cliente, Double saldo) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.saldo = saldo;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
