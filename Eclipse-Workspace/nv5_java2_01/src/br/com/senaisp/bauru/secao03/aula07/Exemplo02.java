package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome completo: ");
		String nome = sc.next();//token padrão é espaço em branco
		System.out.println("Seu nome é " + nome);
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o seu endereço: ");
		String endereço = sc.nextLine();//token é o termino de linha \n
		System.out.println("O seu endereço é: "+ endereço);
		System.out.println("Sua idade é: " + idade);
		sc.close();
	}

}
