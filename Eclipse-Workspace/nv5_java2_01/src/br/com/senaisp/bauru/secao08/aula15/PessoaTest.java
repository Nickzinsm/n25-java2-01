package br.com.senaisp.bauru.secao08.aula15;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pe01 = new PessoaFisica();
		Pessoa pe02 = new PessoaJuridica();
		pe01.setNome("Roberval da Silva");
		try {
			pe01.setEndereco("Rua das Ruas, 1234");
			pe01.setDocumento("123.456.789-09");
		}catch (DocumentoException e) {
			System.out.println("O documento está inválido");
		}catch (EnderecoException e) {
			System.out.println("O endereço está inválido");
		} catch (Exception e) {
			e.printStackTrace();
		}
		pe01.setDataNascimento("20/05/1999");
		System.out.println(pe01);
		
		pe02.setNome("Roberval da Silva");
		try {
			pe02.setEndereco("Rua das Ruas, 1234");
			pe02.setDocumento("123.456.789-09");
		} catch (DocumentoException e) {
			System.out.println("O documento está inválido");
		}catch (EnderecoException e) {
			System.out.println("O endereço está inválido");
		} catch (Exception e) {
			e.printStackTrace();
		}
		pe02.setDataNascimento("20/05/1999");
		System.out.println(pe02);
	}

}
