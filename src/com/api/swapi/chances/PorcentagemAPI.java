package com.api.swapi.chances;

import java.util.Random;

public class PorcentagemAPI {
	
	public static boolean getPorcentagem(double porcent) {
		if (porcent > 100 || porcent < 0) {
			throw new IllegalArgumentException("Percentage cannot be greater than 100 or less than 0!");
		}
		double resultado = new Random().nextDouble() * 100;
		return resultado <= porcent;
	}

}
