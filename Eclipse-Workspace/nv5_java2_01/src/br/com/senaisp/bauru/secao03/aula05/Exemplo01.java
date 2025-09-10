package br.com.senaisp.bauru.secao03.aula05;

public class Exemplo01 {

	public static void main(String[] args) {
		char letra =65;
		System.out.println(letra);
		letra = 'A';
		System.out.println(letra);
		letra++; //passa para a letra B
		System.out.println(letra);
		letra--; //passa a ser a letra A novamente
		System.out.println(letra);
		//cuidados ao imprimir mais de uma letra
		//o exemplo abaixo soma os valores, não concatena
		System.out.println(letra + letra);
		//nesse outro exemplo iremos concatenar
		System.out.println("" + letra + letra);
	}

}
