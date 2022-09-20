package callcenter;

public class Empresa {

	private String nombreEmpresa;
	private Contacto[] contactos;

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public boolean agregarNuevoContacto(Contacto nuevo) {
		/*
		 * Incorpora un nuevo contacto a la empresa
		 */
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contactos[i] = nuevo;
				return true;
			}
		}

		return false;
	}

	public boolean agregarNuevaZonaDeCobertura(int codigoPostal) {
		/*
		 * Incorpora una nueva zona de cobertura (Las zonas de cobertura se identifican
		 * por el codigo postal)
		 */

		return false;
	}

	private boolean elCodigoPostalEstaDentroDeLaZonaDeCobertura(int codigoPostal) {
		/*
		 * Determina si un c�digo postal est� dentro de la zona de cobertura
		 */
		return false;
	}

	public Contacto buscarCandidato() {
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
