package br.com.senaisp.bauru.nick.classes;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastraentoProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Sistema de Controle de Produtos");
			System.out.println("1 - Cdastrar um produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Consultra produtos");
			System.out.println("4 - Alterar produtos");
			System.out.println("5 - Executar produtos");
			System.out.println("9 - Fim");
			System.out.println("9 - Escolha sua opção");
			// Tratamento para entrada de opção
			try {
				op = sc.nextInt();
			} catch (InputMismatchException e) {
				op = 0;
				sc.nextLine();
			}
			// Verificando as opções
			switch (op) {
			case 1 -> cadastrarProduto(sc);
			case 2 -> cadastrarProduto(sc);
			case 3 -> consultarProduto(sc);
			case 4 -> cadastrarProduto(sc);
			case 5 -> ExcluirProduto(sc);
			case 9 -> System.out.println("Ate mais");
			default -> System.out.println("Opção invalida");

			}

		} while (op != 9);
	}

	private static Object ExcluirProduto(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object consultarProduto(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void cadastrarProduto(Scanner sc) {
		System.out.println("Cdastramento de produto");
		do {
			try {
				if (sc.hasNext()) sc.nextLine();
				//se tiver algo ainda no scanner, capturamos na linha acima
				System.out.println("Digite a descrição");
				String desc = sc.nextLine();

				System.out.println("Digite o saldo: ");
				double saldo = sc.nextDouble();

				System.out.println("Digite o preço");
				double preco = sc.nextDouble();
				
				sc.nextLine(); //capturando o enter do preco
				
				System.out.println("Confirma a gravação do produto S/N ? ");
				String conf =sc.nextLine();
				
				if (conf.toLowerCase().equals("s")) {
				try {
					Produto.create(desc, saldo, preco);
				} catch (SQLException e) {
					System.out.println("Problema ao gravar registro " +
										e.getMessage());
				}
				}
				

			} catch (InputMismatchException e) {
				System.out.println("Por favor, digite somente numeros");
			}
		} while (true);
	}

}
