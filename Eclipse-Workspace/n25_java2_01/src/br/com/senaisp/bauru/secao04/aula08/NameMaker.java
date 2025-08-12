package br.com.senaisp.bauru.secao04.aula08;

import java.util.Scanner;

public class NameMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = sc.next();
		String nomeDoMeio = sc.next();
		String ultimoNome = sc.next();
		String nomeCompleto = nome + " " + nomeDoMeio + " " + ultimoNome;
		System.out.println(nome + "\n" + nomeDoMeio + "\n" + ultimoNome + "\n" + nomeCompleto);
		sc.close();
	}

}
