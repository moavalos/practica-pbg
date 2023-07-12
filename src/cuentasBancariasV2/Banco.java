package cuentasBancariasV2;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	
	private Set<Cuenta> cuentas;
	
	public Banco() {
		this.cuentas = new HashSet<>();
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		this.cuentas.add(cuenta);		 
	}

	public void transfer(double d, String string, String string2) {
		
		
	}

}
