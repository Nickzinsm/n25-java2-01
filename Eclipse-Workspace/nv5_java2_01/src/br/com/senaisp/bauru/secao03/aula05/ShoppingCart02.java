package br.com.senaisp.bauru.secao03.aula05;

public class ShoppingCart02 {

	public static void main(String[] args) {
		 String custName = "Alex";
	     String itemDesc = "Camiseta";
	     double preco = 5.00;
	     double imposto = 18.00;
	     int quantidade = 2;
	     //Montar mensagem
	     double totalPrice = preco * quantidade * (1 + imposto/100);
	     //vamos precisar ajustar a mensagem para esse exercicio
	     String message = custName+" quer comprar " + quantidade + " " + itemDesc +
	    		 "\n0 Custo total com imposto é R$: " + Math.round(totalPrice*100)/100.;
	     //Math.round arredonda para parte de inteira (caso de um valor fracionário), por isso multiplicamos 
	     //imprimir mensagem
	     System.out.println(message);
	}

}
