package udi_decola;

public class Voo extends Empresa_Aerea {
	//atributos
	private String codigoIden; //3 letras(origem) e 5 números(3 primeiros são os assentos do avião, os dois últimos o id da empresa aérea)
	private String nomeEmpresa;
	private String lclOrigem;
	private String lclDestino;
	private String horaSaida;
	private String horaChegada;
	private float preco;
	private int numVagas;
	private String epocaAno;

//Construtores
public Voo();
public Voo(String codigoIden, String lclOrigem, String nomeEmpresa, String lclDestino, String horaSaida, String horaChegada, float preco, int numVagas, String epocaAno, String CNPJ, String nome, String nomeDiv, String dataCriacao){
	super(CNPJ, nome, nomeDiv, dataCriacao);
	this.nomeEmpresa = nomeEmpresa;
	this.codigoIden = codigoIden;
	this.lclOrigem = lclOrigem;
	this.lclDestino = lclDestino;
	this.horaSaida = horaSaida;
	this.horaChegada = horaChegada;
	this.preco = preco;
	this.numVagas = numVagas;
	this.epocaAno = epocaAno;
}
//gets e sets
public String getCodigoIden() {
	return codigoIden;
}
public void setCodigoIden(String codigoIden) {
	this.codigoIden = codigoIden;
}
public String getLclOrigem() {
	return lclOrigem;
}
public void setLclOrigem(String lclOrigem) {
	this.lclOrigem = lclOrigem;
}
public String getLclDestino() {
	return lclDestino;
}
public void setLclDestino(String lclDestino) {
	this.lclDestino = lclDestino;
}
public String getHoraSaida() {
	return horaSaida;
}
public void setHoraSaida(String horaSaida) {
	this.horaSaida = horaSaida;
}
public String getHoraChegada() {
	return horaChegada;
}
public void setHoraChegada(String horaChegada) {
	this.horaChegada = horaChegada;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public int getNumVagas() {
	return numVagas;
}
public void setNumVagas(int numVagas) {
	this.numVagas = numVagas;
}
public String getEpocaAno() {
	return epocaAno;
}
public void setEpocaAno(String epocaAno) {
	this.epocaAno = epocaAno;
}

//metodos
public float calculaPreco (String CPF) {
	
}

//construtores


}
