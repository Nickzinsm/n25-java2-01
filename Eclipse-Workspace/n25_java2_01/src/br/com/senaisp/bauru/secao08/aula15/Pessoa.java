package br.com.senaisp.bauru.secao08.aula15;

public class Pessoa {
private static int contador = 0;
private String nome;
private int id;
private String documento;
private String endereço;
private String dataNascimeto;
//Constructor
public Pessoa() {
	id = ++contador;
}
//Sobrecarga de Constructor
public Pessoa(String nom, String doc, String ende, String dtNas) {
	setNome(nom);
	setDocumento(doc);
	setEndereço(ende);
	setDataNascimeto(dtNas);
	
}
private void carregarId() {
	id = ++contador;
}
public String getNome() {
	return nome;
	
}
public void set
	
	
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDocumento() {
	return documento;
}
public void setDocumento(String documento) {
	this.documento = documento;
}
public String getEndereço() {
	return endereço;
}
public void setEndereço(String endereço) {
	this.endereço = endereço;
}
public String getDataNascimeto() {
	return dataNascimeto;
}
public void setDataNascimeto(String dataNascimeto) {
	this.dataNascimeto = dataNascimeto;
}
public int getId() {
	return id;
}
//Metodos
	@Override
		public String toString() {
			return "=".repeat(20) + "\n" +
			"Id: + " + getId() + "\n" +
			"Nome: " + getNome() + "\n" +
			"Endereço: " + getEndereço() + "\n" +
			"Documento: " + getDocumento() + "\n" +
			"Data de Nascimento: " + getDataNascimeto() + "\n";
					
		}
}
