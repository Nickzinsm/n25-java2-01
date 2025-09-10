package br.com.senaisp.bauru.secao04.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(OrdemTexto.class.getResourceAsStream("palavras.txt"));
		//Definindo variáveis de trabalho
		String maiorTexto, menorTexto;
		//Setando o maior e o menor com o primeiro texto
		maiorTexto = sc.nextLine();
		menorTexto = maiorTexto;//Igualando os endereços para o mesmo conteúdo
		//Vamos usar o while 9já viu no Java1)
		while (sc.hasNextLine()){
			String apoio = sc.nextLine();
			//Comparando os textos - menor 
			if (apoio.compareTo(menorTexto)<0) {
				menorTexto = "" +apoio;
			}
			//Comparando os textos - maior
			if (apoio.compareTo(maiorTexto)>0) {
				maiorTexto = "" + apoio;
			}
		}
		System.out.println("Maior texto foi " + maiorTexto);
		System.out.println("Menor texto foi " + menorTexto);
		//Fechando o arquivo
		sc.close();
	}

}
