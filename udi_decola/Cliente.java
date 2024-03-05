package udi_decola;

public class Cliente extends Pessoa{
	//atributos
private String dataNascimento;
private String email;
private int contCompra;
private float precoTotal;

//constantes
public static final int numViraVP = 4;

//Construtores
	public Cliente(String dataNascimento, String email, int contCompra, float precoTotal, String nome, String CPF, String endereco){
		super(nome, CPF, endereco)
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.contCompra = contCompra;
		this.precoTotal = precoTotal;
	}

//gets e sets
public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getContCompra() {
	return contCompra;
}

public void setContCompra(int contCompra) {
	this.contCompra = contCompra;
}

public float getPrecoTotal() {
	return precoTotal;
}

public void setPrecoTotal(float precoTotal) {
	this.precoTotal = precoTotal;
}

public int getNumViraVP() {
	return numViraVP;
}

//metodos
//construtores

}
