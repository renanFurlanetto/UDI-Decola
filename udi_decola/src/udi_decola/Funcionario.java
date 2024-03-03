package udi_decola;

public class Funcionario {
	//atributos
	private String nome;
	private String CPF;
	private String endereco;
	private String carteiraTrabalho;
	private int contadorParceria;

//constantes
final float salBase = 2300;
final float valorRegistro = 400;

//gets e sets
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCPF() {
	return CPF;
}
public void setCPF(String cPF) {
	CPF = cPF;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
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
