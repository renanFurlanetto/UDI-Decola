package udi_decola;

public class VIP extends Cliente{
	//atributos
	private float desconto;

//Construtores
public VIP(String dataNascimento, String email, String nome, String CPF, String endereco, float desconto, float descontoVIP) {
	super(dataNascimento, email, nome, CPF, endereco, descontoVIP);
	this.desconto = desconto;
}

//gets e sets
public float getDesconto() {
	return desconto;
}

public void setDesconto(float desconto) {
	this.desconto = desconto;
}

//metodos
//construtores


}
