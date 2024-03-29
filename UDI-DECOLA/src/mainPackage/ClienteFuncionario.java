package mainPackage;

public class ClienteFuncionario extends Cliente{
    private float descontoFuncionario;

    public ClienteFuncionario(String dataNascimento, String email, String nome, String CPF, String endereco) {
        super(dataNascimento, email, nome, CPF, endereco);
        this.descontoFuncionario = 400;
    }

    public float getDescontoFuncionario(){
        return descontoFuncionario;
    }

}
