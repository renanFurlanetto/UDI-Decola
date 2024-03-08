package udi_decola;

public class Luxo extends Hotel{
	//atributos
	private int numQuartos;
	private float preco;
	private float desconto;

//Construtores
public Luxo(String CNPJ, String nome, String nomeDiv, String endereco, String cidade, String anoCriacao, int numEstrelas, boolean aceitaPet, boolean aceitaCancel, int numQuartos, float preco, float desconto ,String check_in, String check_out, String descricao, String data, int qntDiasHospedagem, Funcionario funcionario) {
	super(CNPJ, nome, nomeDiv, endereco, cidade, anoCriacao, numEstrelas, aceitaPet, aceitaCancel, numQuartos, check_in, check_out, descricao, data,qntDiasHospedagem,funcionario);
	this.numQuartos = numQuartos;
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
	public float calculaPreco() {
		int numeroQuartos = getNumQuartos();
		setNumQuartos(numeroQuartos - numQuartos);
		return preco*numQuartos;
	}

//metodos
//construtores

}
