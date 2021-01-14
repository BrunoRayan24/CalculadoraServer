package br.com.calculadora;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculadoraCliente {

	public static void main(String args[]) throws Exception {
		
		// cliente
		
		while (true) {

			URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
			QName qname = new QName("http://calculadora.com.br/", "CalculadoraServerImplService");
			Service ws = Service.create(url, qname);
			CalculadoraServer calc = ws.getPort(CalculadoraServer.class);

			Scanner sc = new Scanner(System.in);

			System.out.println("------------------------------");
			System.out.println("-- Digite Uma Opção:        --");
			System.out.println("1 - Soma ");
			System.out.println("2 - Subtração ");
			System.out.println("3 - Multiplicação ");
			System.out.println("4 - Divisão");
			System.out.println("------------------------------");

			int opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("1 - Soma");
				System.out.println("Digite Um Numero");
				int op2 = sc.nextInt();
				System.out.println("Digite Um 2°Numero");
				int op3 = sc.nextInt();
				System.out.println("Resultado: " + calc.soma(op2, op3));
			} else if (opcao == 2) {
				System.out.println("2 - Subtração ");
				System.out.println("Digite Um Numero");
				int op2 = sc.nextInt();
				System.out.println("Digite Um 2°Numero");
				int op3 = sc.nextInt();
				System.out.println("Resultado: " + calc.subtracao(op2, op3));
			} else if (opcao == 3) {
				System.out.println("3 - Multiplicação ");
				System.out.println("Digite Um Numero");
				int op2 = sc.nextInt();
				System.out.println("Digite Um 2°Numero");
				int op3 = sc.nextInt();
				System.out.println("Resultado: " + calc.multiplicacao(op2, op3));
			} else if (opcao == 4) {
				System.out.println("4 - Divisão");
				System.out.println("Digite Um Numero");
				int op2 = sc.nextInt();
				System.out.println("Digite Um 2°Numero");
				int op3 = sc.nextInt();
				System.out.println("Resultado: " + calc.divisao(op2, op3));

			}

		}

	}

}
