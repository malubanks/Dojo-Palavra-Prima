package dojo;

public class PalavraPrima {
	public static int converteEmNumero(String palavra) {
		int valorNumerico = 0;
		int acumulador = 0;
		for (int i = 0; i < palavra.length(); i++) {
			valorNumerico = palavra.charAt(i);
			if (valorNumerico <= 90 && valorNumerico >= 65) {
				valorNumerico -= 38;
			} else if (valorNumerico <= 122 && valorNumerico >= 97) {
				valorNumerico -= 96;
			} else {
				throw new IllegalArgumentException("Caractere invalido");
			}
			acumulador += valorNumerico;
		}
		/*
		 * if (palavra == "a") return 1; else if (palavra == "b") return 2; else
		 * if (palavra == "A") return 27; else if (palavra == "z") return 26;
		 * else if (palavra == "Z") return 52;
		 */
		return acumulador;

	}

	public static boolean ehPrimo(int num) {
		if (num == 1)
			return false;
		/*
		 * if (num % 2 == 0 && num != 2) return false;
		 */
		for (int i = 2; i > 1 && i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static boolean ehPalavraPrima(String palavra) {
		int valorNumerico = PalavraPrima.converteEmNumero(palavra);
		boolean resultadoTeste = PalavraPrima.ehPrimo(valorNumerico);
		return resultadoTeste;
	}

}