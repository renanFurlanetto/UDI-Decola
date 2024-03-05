package udi_decola;

public class VIP extends Cliente{
	//atributos
	private float desconto;

//Construtores
public VIP(String dataNascimento, String email, int contCompra, float precoTotal, String nome, String CPF, String endereco, float desconto) {
	super(dataNascimento, email, contCompra, precoTotal, nome, CPF, endereco);
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
