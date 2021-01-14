package br.com.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.calculadora.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

	public int soma(int num1, int num2) {

		// Converte de Binario para Decimal
		int x = this.binarioParaDecimal(String.valueOf(num1));
		int y = this.binarioParaDecimal(String.valueOf(num2));

		// Soma os valores em Decimal
		int result = x + y;

		// Retorna a soma em Binario
		return this.binarioStringParaBinarioDecimal(this.decimalParaBinario(String.valueOf(result)));
	}

	public int subtracao(int num1, int num2) {

		// Converte de Binario para Decimal
		int x = this.binarioParaDecimal(String.valueOf(num1));
		int y = this.binarioParaDecimal(String.valueOf(num2));

		// subtrai os valores em Decimal
		int result = x - y;

		// Retorna a soma em Binario
		return this.binarioStringParaBinarioDecimal(this.decimalParaBinario(String.valueOf(result)));
	}

	public int multiplicacao(int num1, int num2) {

		// Converte de Binario para Decimal
		int x = this.binarioParaDecimal(String.valueOf(num1));
		int y = this.binarioParaDecimal(String.valueOf(num2));

		// Multiplica os valores em Decimal
		int result = x * y;

		// Retorna a soma em Binario
		return this.binarioStringParaBinarioDecimal(this.decimalParaBinario(String.valueOf(result)));
	}

	public int divisao(int num1, int num2) {

		// Converte de Binario para Decimal
		int x = this.binarioParaDecimal(String.valueOf(num1));
		int y = this.binarioParaDecimal(String.valueOf(num2));

		// Se x for 0 vai dar erro na divisao

		// divide os valores em Decimal
		int result = x / y;

		// Retorna a soma em Binario

		return this.binarioStringParaBinarioDecimal(this.decimalParaBinario(String.valueOf(result)));

	}

	// Converte um Binario em String para Binario em Decimal
	public int binarioStringParaBinarioDecimal(String valor) {
		return Integer.valueOf(valor);
	}

	// Converte um Binario para Decimal
	public int binarioParaDecimal(String binario) {
		int decimal = Integer.parseInt(binario, 2);
		return decimal;
	}

	// Converte um Decimal para Binario
	public String decimalParaBinario(String decimal) {
		Integer inteiro = Integer.valueOf(decimal);
		int ix = inteiro.intValue();
		@SuppressWarnings("static-access")
		String resultado = inteiro.toBinaryString(ix);
		return resultado;
	}

}
