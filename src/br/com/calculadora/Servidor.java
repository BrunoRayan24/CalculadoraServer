package br.com.calculadora;

import javax.xml.ws.Endpoint;

public class Servidor {

	public static void main(String[] args) {

		Endpoint.publish("http://127.0.0.1:9876/calc", new CalculadoraServerImpl());
		System.out.println("------------------------------");
		System.out.println("Servidor Iniciado: ");
		System.out.println("http://127.0.0.1:9876/calc");
		System.out.println("------------------------------");
	}
}
