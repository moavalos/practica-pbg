package transporte;

public class Vehiculo {

	private Double longitud;
	private Double latitud;// grados Norte, en el sistema de coordenadas WGS-84.

	@Override
	public int hashCode() {
		// return Objects.hash(latitud, longitud);
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Vehiculo other = (Vehiculo) obj;
//		return Objects.equals(latitud, other.latitud) && Objects.equals(longitud, other.longitud);
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;

	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

}
