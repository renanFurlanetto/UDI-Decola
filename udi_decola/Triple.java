package udi_decola;

public class Triple extends Standart{
	//atributos
	private int numQuartos;
	private float preco;
	private float desconto;

//Cosntrutores
public Triple();
public Triple(String CNPJ, String nome, String nomeDiv, String endereco, String cidade, String anoCriacao, int numEstrelas, boolean aceitaPet, boolean aceitaCancel, int numQuartos, String check_in, String check_out, String descricao, String epocaAno, String data, String nomeFuncionarioResponsavel, int numQuartosTriple, float preco, float desconto) {
	super(CNPJ, nome, nomeDiv, endereco, cidade, anoCriacao, numEstrelas, aceitaPet, aceitaCancel, numQuartos, check_in, check_out, descricao, epocaAno, data, nomeFuncionarioResponsavel);
	this.numQuartos = numQuartosTriple;
	this.preco = preco;
	this.desconto = desconto;
}

//gets e sets
public int getNumQuartos() {
	return numQuartos;
}
public void setNumQuartos(int numQuartos) {
	this.numQuartos = numQuartos;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public float getDesconto() {
	return desconto;
}
public void setDesconto(float desconto) {
	this.desconto = desconto;
}

//metodos
//construtores

}
