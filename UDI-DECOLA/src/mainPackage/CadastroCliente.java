package mainPackage;

import java.util.ArrayList;

public class CadastroCliente {

    private ArrayList<String> cpfsClientes;

    public CadastroCliente() {
        this.cpfsClientes = new ArrayList<>();
    }

    public void adicionarCPFCliente(String cpf) {
        cpfsClientes.add(cpf);
    }

    public boolean cpfCadastrado(String cpf) {
        return cpfsClientes.contains(cpf);
    }
}
