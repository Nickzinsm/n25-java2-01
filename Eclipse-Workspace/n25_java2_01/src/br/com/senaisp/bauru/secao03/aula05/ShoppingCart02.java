package br.com.senaisp.bauru.secao03.aula05;

public class ShoppingCart02 {

	public static void main(String[] args) {

		//Declarar as variaveis do exercicio
		String custName="Alex";
		String itemDesc="camiseta";
		double preco = 5.00;
		double imposto = 18.00;
		double quantidade = 2;
		//Montar a mensagem
		double totalPrice =  preco * quantidade * (1 + imposto / 100);
		String message = custName + " quer comprar " + "um(a)" + " " + itemDesc +
								"\nO custo total com imposto é R$: " + 
								Math.round(totalPrice*100/100.);
		//Math.round arredonda para parte interna, por isso multiplico por 100 e 
		//depois divido por 100. (divisão inteira iria suprir as casas)
		//Imprimir a mensagem
		System.out.println(message);
	}

}
