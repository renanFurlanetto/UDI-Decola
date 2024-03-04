package udi_decola;

//bibliotecas usadas nesse programa
// java.util (ja automaticamente nas versões mais recentes)
// java.time


/*import java.util.Arrays;

public class PassagemAerea {
    String origem;
    String destino;
    double preco;

    public PassagemAerea(String origem, String destino, double preco) {
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
    }

    public static PassagemAerea[] adicionarPassagem(PassagemAerea[] passagens, String origem, String destino, double preco) {
        PassagemAerea novaPassagem = new PassagemAerea(origem, destino, preco);

        // Cria um novo vetor com tamanho maior
        PassagemAerea[] novoVetor = Arrays.copyOf(passagens, passagens.length + 1);

        // Adiciona a nova passagem ao final do vetor
        novoVetor[passagens.length] = novaPassagem;

        return novoVetor;
    }

    public static void main(String[] args) {
        // Vetor inicial de passagens aéreas
        PassagemAerea[] passagensAereas = new PassagemAerea[0];

        // Adiciona uma passagem ao vetor
        passagensAereas = adicionarPassagem(passagensAereas, "SP", "RJ", 300.0);

        // Adiciona outra passagem ao vetor
        passagensAereas = adicionarPassagem(passagensAereas, "NY", "LA", 500.0);

        // Mostra todas as passagens aéreas no vetor
        for (PassagemAerea passagem : passagensAereas) {
            System.out.println("Trecho: " + passagem.origem + " - " + passagem.destino + ", Preço: " + passagem.preco);
        }
    }
}
*/

/*import java.time.LocalDateTime;

public class ObterHorario {
    public static void main(String[] args) {
        // Obtém a data e hora atual
        LocalDateTime agora = LocalDateTime.now();

        // Exibe a data e hora atual
        System.out.println("Data e Hora Atual: " + agora);
    }
}
*/

public class Main {

	public static void main(String[] args) {
		//CONSTRUÇÃO DE OBJETOS PARA TESTES NA MAIN
		
		//construção de empresas aereas ficticias
		
		//construção de voos ficticios
		
		//construção de funcionarios ficticios
		
		//construção de clientes ficticios
		
		//construção de hoteis ficticios
		
		
		// tentar construir umm objeto da classe Pessoa com um cpf invalido
		
		
		//TESTANDO FUNCIONALIDADES
		
		//cadastra (outra) empresa aerea
		
		//cadastra (outro) hotel
		
		//cadastra (outro) Cliente
		
		//cadastra (outro) funcionario que tambem é cliente
		
		//cadastra (outro) funcionario que não é cliente
		
		//realizar uma compra so de passagem
		
		//realizar uma compra de passagem e hotel - cliente não VIP
		
		//realizar uma compra de passagem e hotel - cliente VIP
		
		//verificar faturamento da UDI-DECOLA
		
		
		//FAZER PESQUISAS INTERNAS 
		//qual o destino mais procurado
		
		//qual epoca do ano mais procurada
		
		//qual horario de maior pesquisa dos clientes
		
		
		//perguntar se deseja comprar mais algum "pacote" ou se deseja sair

	}

}
