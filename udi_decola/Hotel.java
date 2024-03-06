package udi_decola;

public class Hotel {
	//atributos
	private String CNPJ;
	private String nome;
	private String nomeDiv;
	private String endereco;
	private String cidade;
	private String anoCriacao;
	private int numEstrelas;
	private boolean aceitaPet;
	private boolean aceitaCancel;
	private int numQuartos;
	private String check_in;
	private String check_out;
	private String descricao;
	private String epocaAno;
	private String data;

	private String nomeFuncionarioResponsavel;
//constantes
public static final float precoUDIDECOLA = 300;

//Construtores
public Hotel();
public Hotel(String CNPJ, String nome, String nomeDiv, String endereco, String cidade, String anoCriacao, int numEstrelas, boolean aceitaPet, boolean aceitaCancel, int numQuartos, String check_in, String check_out, String descricao, String epocaAno, String data, String nomeFuncionarioResponsavel) {
	this.CNPJ = CNPJ;
	this.nome = nome;
	this.nomeDiv = nomeDiv;
	this.endereco = endereco;
	this.cidade = cidade;
	this.anoCriacao = anoCriacao;
	this.numEstrelas = numEstrelas;
	this.aceitaPet = aceitaPet;
	this.aceitaCancel = aceitaCancel;
	this.numQuartos = numQuartos;
	this.check_in = check_in;
	this.check_out = check_out;
	this.descricao = descricao;
	this.epocaAno = epocaAno;
	this.data = data;
	this.nomeFuncionarioResponsavel = nomeFuncionarioResponsavel;
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
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getAnoCriacao() {
	return anoCriacao;
}
public void setAnoCriacao(String anoCriacao) {
	this.anoCriacao = anoCriacao;
}
public int getNumEstrelas() {
	return numEstrelas;
}
public void setNumEstrelas(int numEstrelas) {
	this.numEstrelas = numEstrelas;
}
public boolean isAceitaPet() {
	return aceitaPet;
}
public void setAceitaPet(boolean aceitaPet) {
	this.aceitaPet = aceitaPet;
}
public boolean isAceitaCancel() {
	return aceitaCancel;
}
public void setAceitaCancel(boolean aceitaCancel) {
	this.aceitaCancel = aceitaCancel;
}
public int getNumQuartos() {
	return numQuartos;
}
public void setNumQuartos(int numQuartos) {
	this.numQuartos = numQuartos;
}
public String getCheck_in() {
	return check_in;
}
public void setCheck_in(String check_in) {
	this.check_in = check_in;
}
public String getCheck_out() {
	return check_out;
}
public void setCheck_out(String check_out) {
	this.check_out = check_out;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String getEpocaAno() {
	return epocaAno;
}
public void setEpocaAno(String epocaAno) {
	this.epocaAno = epocaAno;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getNomeFuncionarioResponsavel() {
	return nomeFuncionarioResponsavel;
}
public void setNomeFuncionarioResponsavel(String nomeFuncionarioResponsavel) {
	this.nomeFuncionarioResponsavel = nomeFuncionarioResponsavel;
}
public float getPrecoUDIDECOLA() {
	return precoUDIDECOLA;
}

//metodos
//construtores


}
