package callcenter;

public class Empresa {

	private String nombreEmpresa;
	private Contacto[] contactos;
	private Integer zonasDeCobertura[];
	// private Llamada llamadas[];

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.contactos = new Contacto[100];
		this.zonasDeCobertura = new Integer[100000];
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public boolean agregarNuevoContacto(Contacto nuevo) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contactos[i] = nuevo;
				return true;
			}
		}

		return false;
	}

	public boolean agregarNuevaZonaDeCobertura(int codigoPostal) {
		for (int i = 0; i < zonasDeCobertura.length; i++) {
			if (zonasDeCobertura[i] == null) {
				zonasDeCobertura[codigoPostal] = codigoPostal;
				return true;
			}
		}
		/*
		 * Incorpora una nueva zona de cobertura (Las zonas de cobertura se identifican
		 * por el codigo postal)
		 */

		return false;
	}

	private boolean elCodigoPostalEstaDentroDeLaZonaDeCobertura(int codigoPostal) {
		for (int i = 0; i < zonasDeCobertura.length; i++) {
			if (zonasDeCobertura[i].equals(codigoPostal)) {
				return true;

			}
		}
		return false;
	}

	public Contacto buscarCandidato() {
		Llamada l = new Llamada(false, "fdsfd");
		for (int i = 0; i < contactos.length; i++) {
			// for (int j = 0; j < zonasDeCobertura.length; j++) {
			if (!(contactos[i].getEsCliente()) && l.isFueExitosa()
					&& contactos[i].getCodigo().equals(zonasDeCobertura)) {

			}
		}
		/*
		 * Para determinar qu� contacto el sistema debe mostrar, se debe realizar la
		 * siguiente b�squeda: 1. El contacto NO debe ser cliente a�n. 2. El contacto
		 * desea ser llamado o al menos no inform� lo contrario. 3. El c�digo postal del
		 * contacto debe existir en las zonas de cobertura existente. 4. Del conjunto de
		 * contactos resultante se debe seleccionar aleatoriamente el pr�ximo llamado.
		 */

		return null;
	}

}
