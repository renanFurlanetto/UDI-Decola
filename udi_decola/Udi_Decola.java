package udi_decola;

public class Udi_Decola {
	//atributos
	private double faturamento_total;
	private String CNPJ;
	private String nome;
	private String nomeDiv;
	private int num_vendas;

//construtores
public Udi_Decola(double faturamento_total, String CNPJ, String nome, String nomeDiv, int num_vendas){
	this.faturamento_total = faturamento_total;
	this.CNPJ = CNPJ;
	this.nome = nome;
	this.nomeDiv = nomeDiv;
	this.num_vendas = num_vendas;
}

//gets e sets
public double getFaturamento_total() {
	return faturamento_total;
}
public void setFaturamento_total(double faturamento_total) {
	this.faturamento_total = faturamento_total;
}
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
public int getNum_vendas() {
	return num_vendas;
}
public void setNum_vendas(int num_vendas) {
	this.num_vendas = num_vendas;
}

//metodos

//nao sei fazer e pegar de outra classe
public void calculaFaturamento () {
	faturamento_total = getNum_vendas * precoUDI + getNum_vendas * getPrecoUDIDECOLA()
	
}
}
