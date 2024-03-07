package udi_decola;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente extends Pessoa{
	//atributos
private String dataNascimento;
private String email;
private int contCompra;
private float precoTotal;

private boolean clienteVIP;
private float descontoVIP;

//constantes
public static final int numViraVP = 4;

//Construtores
	public Cliente(String dataNascimento, String email, String nome, String CPF, String endereco, float descontoVIP){
		super(nome, CPF, endereco);
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.descontoVIP = descontoVIP;
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
public boolean getClienteVIP() {return clienteVIP;}
public void setClienteVIP(){this.clienteVIP = true;}

public boolean isClienteVIP() {return clienteVIP;}
public float getDescontoVIP() {return descontoVIP;}
public void setDescontoVIP(float descontoVIP) {this.descontoVIP = descontoVIP;}

	//metodos
public void adicionarCPFCliente(cadastroClientes cadastroClientes) {
		cadastroClientes.adicionarCPFCliente(this.getCPF());
	}
public static boolean validarEmail(String email) {
	String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
	}
}
