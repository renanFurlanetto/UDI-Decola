package udi_decola;

/* // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;

        // Verifica se o CPF é válido antes de atribuir
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }*/

/* private boolean validarCPF(String cpf) {
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");*/

/*public class ValidarCPF {
public static void main(String[] args) {
    String cpf = "123.456.789-09";

    if (validarCPF(cpf)) {
        System.out.println("CPF válido");
    } else {
        System.out.println("CPF inválido");
    }
}

public static boolean validarCPF(String cpf) {
    // Remove caracteres não numéricos
    String cpfNumerico = cpf.replaceAll("[^0-9]", "");

    // Verifica se o CPF tem 11 dígitos
    if (cpfNumerico.length() != 11) {
        return false;
    }

    // Calcula o primeiro dígito verificador
    int primeiroDigito = calcularDigito(cpfNumerico.substring(0, 9));

    // Calcula o segundo dígito verificador
    int segundoDigito = calcularDigito(cpfNumerico.substring(0, 9) + primeiroDigito);

    // Verifica se os dígitos verificadores calculados são iguais aos fornecidos no CPF
    return cpfNumerico.endsWith(Integer.toString(primeiroDigito) + Integer.toString(segundoDigito));
}

private static int calcularDigito(String parteCpf) {
    int soma = 0;
    int peso = parteCpf.length() + 1;

    for (int i = 0; i < parteCpf.length(); i++) {
        soma += Character.getNumericValue(parteCpf.charAt(i)) * peso;
        peso--;
    }

    int resto = soma % 11;
    return (resto < 2) ? 0 : (11 - resto);
}*/

public class Pessoa {
//atributos
	private String nome;
	private String CPF;
	private String endereco;
	
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//metodos
	//construtores
	
	
	
}
