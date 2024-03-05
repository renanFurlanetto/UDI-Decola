package udi_decola;

public class Empresa_Aerea {
	//atributos
	private String CNPJ;
	private String nome;
	private String nomeDiv;
	private String dataCriacao;

//constantes
public static final float precoUDI = 700;

//Construtores
public Empresa_Aerea(String CNPJ, String nome, String nomeDiv, String dataCriacao){
	this.CNPJ = CNPJ;
	this.nome = nome;
	this.nomeDiv = nomeDiv;
	this.dataCriacao = dataCriacao;
}

//gets e sets
public String getCNPJ() {
	return CNPJ;
}

public void setCNPJ(String cNPJ) {
	CNPJ = cNPJ;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNomeDiv() {
	return nomeDiv;
}

public void setNomeDiv(String nomeDiv) {
	this.nomeDiv = nomeDiv;
}

public String getDataCriacao() {
	return dataCriacao;
}

public void setDataCriacao(String dataCriacao) {
	this.dataCriacao = dataCriacao;
}

public float getPreco() {
	return preco;
}

//metodos
//construtores

}
