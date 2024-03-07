package udi_decola;

import java.util.ArrayList;

public class cadastroClientes {

    private ArrayList<String> cpfsClientes;

    public cadastroClientes() {
        this.cpfsClientes = new ArrayList<>();
    }

    public void adicionarCPFCliente(String cpf) {
        cpfsClientes.add(cpf);
    }

    public boolean cpfCadastrado(String cpf) {
        return cpfsClientes.contains(cpf);
    }
}
