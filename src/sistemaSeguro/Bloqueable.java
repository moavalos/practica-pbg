package sistemaSeguro;

public interface Bloqueable {
	
	Integer getIntentosFallidos();
    void incrementarIntentosFallidos();
    Boolean isBloqueado();
    void setBloqueado(Boolean bloqueado);

}
