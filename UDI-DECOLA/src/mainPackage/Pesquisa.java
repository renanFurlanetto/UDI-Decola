package mainPackage;

public class Pesquisa {
	//atributos
	private String origem;
	private String destino;
	private String dataViagem;

//Construtores

public Pesquisa(String origem, String destino, String dataViagem){
	this.origem = origem;
	this.destino = destino;
	this.dataViagem = dataViagem;
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

public String getDataViagem() {
	return dataViagem;
}

public void setDataViagem(String dataViagem) {
	this.dataViagem = dataViagem;
}

//metodos
//construtores

}
