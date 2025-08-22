package br.com.senaisp.bauru.secao08.aula15;

public class PessoaJuridica extends Pessoa {
	public PessoaJuridica() {
		setTipoPessoa('J');
	}//Fechando constructor
	//Constructor com parametros
		
	public PessoaJuridica(String nom, String doc,
			String ende, String dtNas) throws Exception {
		super(nom, doc, ende, dtNas);
		setTipoPessoa('F');
	}

	protected boolean isDocumentoValido(String documento2) {
		// 12.345.678/0001-00
		return documento2.length() == 18 || documento2.length() == 14;
	}
}

		

