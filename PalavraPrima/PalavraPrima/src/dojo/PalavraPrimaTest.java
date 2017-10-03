package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Coding Dojo utilizando o problema Palavras-Primas
 * 
 * Fonte: Marianna Reis. Palavras Primas. DojoPuzzles.com 
 * [http://dojopuzzles.com/problemas/exibe/palavras-primas/]
 * 
 */
public class PalavraPrimaTest {

	@Test
	public void testConverteLetraAMinusculo() {
		int valor = PalavraPrima.converteEmNumero("a");
		assertEquals(1, valor);
	}

	@Test
	public void testConverteLetraBMinusculo() {
		int valor = PalavraPrima.converteEmNumero("b");
		assertEquals(2, valor);
	}

	@Test
	public void testConverteLetraCMinusculo() {
		int valor = PalavraPrima.converteEmNumero("c");
		assertEquals(3, valor);
	}

	@Test
	public void testConverteLetraAMaisculo() {
		int valor = PalavraPrima.converteEmNumero("A");
		assertEquals(27, valor);
	}

	@Test
	public void testConverteLetraZMinusculo() {
		int valor = PalavraPrima.converteEmNumero("z");
		assertEquals(26, valor);
	}

	@Test
	public void testConverteLetraZMaiusculo() {
		int valor = PalavraPrima.converteEmNumero("Z");
		assertEquals(52, valor);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConverteLetraInvalida() {
		PalavraPrima.converteEmNumero("Ç");
	}

	@Test
	public void test2EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(2);
		assertEquals(true, resultadoTeste);
	}
	@Test
	public void test11EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(11);
		assertEquals(true, resultadoTeste);
	}
	@Test
	public void test15EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(15);
		assertEquals(false, resultadoTeste);
	}

	@Test
	public void test26EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(26);
		assertEquals(false, resultadoTeste);
	}
	@Test
	public void test14EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(14);
		assertEquals(false, resultadoTeste);
	}

	@Test
	public void test1NaoEhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(1);
		assertEquals(false, resultadoTeste);

	}

	@Test
	public void testConverteTextoAAMinusculo() {
		int valor = PalavraPrima.converteEmNumero("aa");
		assertEquals(2, valor);

	}
	@Test
	public void testNome() {
		int valor = PalavraPrima.converteEmNumero("Maria");
		assertEquals(39+1+18+9+1, valor);
	}
	@Test
	public void testPalavraComidaEhPrima() {
		boolean resultadoTeste = PalavraPrima.ehPalavraPrima("Comida");//29+15+13+9+4+1 = 71 que é primo
		assertEquals(true, resultadoTeste);
		
	}
	@Test
	public void testPalavraBolaEhPrima() {
		boolean resultadoTeste = PalavraPrima.ehPalavraPrima("Bola");//28+15+12+1= 56 que não é primo
		assertEquals(false, resultadoTeste);
		
	}
	@Test
	public void testPalavraAMinusculoEhPrima() {
		boolean resultadoTeste = PalavraPrima.ehPalavraPrima("a");
		assertEquals(false, resultadoTeste);
		
	}
	@Test
	public void testPalavraEMinusculoEhPrima() {
		boolean resultadoTeste = PalavraPrima.ehPalavraPrima("e");
		assertEquals(true, resultadoTeste);
		
	}

}