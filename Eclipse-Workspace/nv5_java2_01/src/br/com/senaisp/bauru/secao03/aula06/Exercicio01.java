package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Showzin
		JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao show do PicoJohnson", 
				"SHOW", JOptionPane.INFORMATION_MESSAGE);
		
		String question1 = (String)JOptionPane.showInputDialog(null, "Qual o seu nome?",
				"Questão 01", JOptionPane.QUESTION_MESSAGE,null, null, "Digite aqui!");
		
		//Solicitar para o usuário, seu time favorito, deve selecionar de uma lista de times
		//essa lista deve ter ao menos 5 nomes.
		String[] valores = {"Corinthians","Palmeiras","São Paulo","Vasco","Flamengo","Eu sou é do Rock!"};
		String question2 = (String) JOptionPane.showInputDialog(null, "Qual o seu time favorito?",
				"Questão 2", JOptionPane.QUESTION_MESSAGE,null,valores, valores[0]);
		
		
		//Questões da vida
		//JOptionPane.showConfirmDialog(null, "Você está legal no dia de hoje?",
				//"Bom dia!", 0, JOptionPane.QUESTION_MESSAGE);
		
		//JOptionPane.showMessageDialog(null,"FODA-SE", "ALASTRO", JOptionPane.WARNING_MESSAGE);
	}

}
