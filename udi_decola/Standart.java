package udi_decola;

public class Standart extends Hotel{
	//atributos
	private int numQuartos;

//Construtores
public Standart();
public Standart(String CNPJ, String nome, String nomeDiv, String endereco, String cidade, String anoCriacao, int numEstrelas, boolean aceitaPet, boolean aceitaCancel, int numQuartos, String check_in, String check_out, String descricao, String data, String nomeFuncionarioResponsavel) {
	super(CNPJ, nome, nomeDiv, endereco, cidade, anoCriacao, numEstrelas, aceitaPet, aceitaCancel, numQuartos, check_in, check_out, descricao, data, nomeFuncionarioResponsavel);
	this.numQuartos = numQuartos;
}
//gets e sets
public int getNumQuartos() {
	return numQuartos;
}

public void setNumQuartos(int numQuartos) {
	this.numQuartos = numQuartos;
}

//metodos
//construtores

}
