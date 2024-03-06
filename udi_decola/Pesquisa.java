package udi_decola;

public class Pesquisa {
	//atributos
	private String origem;
	private String destino;
	private String dataInicio;
	private String dataFim;

//Construtores
public Pesquisa();
public Pesquisa(String origem, String destino, String dataInicio, String dataFim){
	this.origem = origem;
	this.destino = destino;
	this.dataInicio = dataInicio;
	this.dataFim = dataFim;
}

//gets e sets
public String getOrigem() {
	return origem;
}
public void setOrigem(String origem) {
	this.origem = origem;
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public String getDataInicio() {
	return dataInicio;
}
public void setDataInicio(String dataInicio) {
	this.dataInicio = dataInicio;
}
public String getDataFim() {
	return dataFim;
}
public void setDataFim(String dataFim) {
	this.dataFim = dataFim;
}

//metodos
//construtores

}
