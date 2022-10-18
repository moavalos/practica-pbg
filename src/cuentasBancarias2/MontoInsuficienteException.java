package cuentasBancarias2;

public class MontoInsuficienteException extends Exception{
	
	public MontoInsuficienteException(){
		super("EL MONTO ES INSUFICIENTE");
	}

}
