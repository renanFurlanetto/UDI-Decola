package udi_decola;

public class Funcionario extends Pessoa {
	//atributos
	private String carteiraTrabalho;
	private int contadorParceria;

//Construtores
public Funcionario();
public Funcionario(String nome, String CPF, String endereco, String carteiraTrabalho, int contadorParceria) {
	super(nome, CPF, endereco);
	this.carteiraTrabalho = carteiraTrabalho;
	this.contadorParceria = contadorParceria;
}
//constantes
final float salBase = 2300;
final float valorRegistro = 400;

//gets e sets
public String getCarteiraTrabalho() {
	return carteiraTrabalho;
}
public void setCarteiraTrabalho(String carteiraTrabalho) {
	this.carteiraTrabalho = carteiraTrabalho;
}
public int getContadorParceria() {
	return contadorParceria;
}
public void setContadorParceria(int contadorParceria) {
	this.contadorParceria = contadorParceria;
}
public float getSalBase() {
	return salBase;
}
public float getValorRegistro() {
	return valorRegistro;
}

//metodos
//construtores

}
