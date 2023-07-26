package billetera;

public interface Pagadora {
	
	Long getNumero();
	String getTitular();
	String getFechaVencimiento();
	Integer getCodigoSeguridad();
}
