package mainPackage;

public class VIP extends Cliente{
	//atributos
	private float desconto;
	private String dataVirouVIP;

//Construtores
public VIP(String dataNascimento, String email, String nome, String CPF, String endereco) {
	super(dataNascimento, email, nome, CPF, endereco);
	this.desconto = 300;
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
