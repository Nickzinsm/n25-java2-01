package br.com.senaisp.bauru.secao08.aula15;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pe01 = new Pessoa();
		Pessoa pe02 = new Pessoa();
		pe01.setNome("Richard Brosler");
		pe01.setNome("Rua Alt, 1234");
		pe01.setNome("123.456.789-09");
		pe01.setNome("20/05/1999");
		
		pe01.setNome("123.456.789-09");
		pe01.setNome("Richard Brosler");
		pe01.setNome("20/05/1999");
		pe01.setNome("Rua Alt, 1234");
		
		
		System.out.println(pe01);
		System.out.println(pe02);
	}

}
