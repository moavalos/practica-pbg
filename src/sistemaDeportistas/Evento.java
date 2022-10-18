package sistemaDeportistas;

public class Evento {
	
	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		participantes = new HashMap<Integer, Deportista>();
	}
	
	public Integer agregarParticipante(Deportista nuevo) {
		participantes.put(++this.numeroDeInscripcion, nuevo);
		return this.numeroDeInscripcion;
	}
	
	public TipoDeEvento getTipo() {
		return tipo;
	}
}
