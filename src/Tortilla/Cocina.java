package Tortilla;

import java.util.Iterator;

public class Cocina {

	private Integer temperaturaMaximaDelHorno = 230;

	public void pelar(Ingrediente ingrediente) {
		if (ingrediente.getCascara().equals(true)) {
			ingrediente.setCascara(false);
		}
	}

	public void freir(Ingrediente ingrediente) {
		if (ingrediente.getCocido().equals(false)) {
			while (ingrediente.getTemperaturaMaximaParaCadaIngrediente() < temperaturaMaximaDelHorno) {
				ingrediente.setCocido(true);
			}
		}
	}

	public void cortar(Ingrediente ingrediente, Integer cortarHastaQSeaCubito) {
		if(ingrediente.getCortado().equals(false)) {
			ingrediente.setCortado(true);
		}
		
	}

	public void batir(Ingrediente ingrediente, Integer cantVecesqSeDebeBatir) {
		for (int i = 0; i < cantVecesqSeDebeBatir; i++) {
			ingrediente.setBatido(true);
		}
	}

}
