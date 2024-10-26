import java.util.HashMap;
import java.util.Scanner;

public class AgendaContatos {
    public static void main(String[] args) {
        // Criação do HashMap para armazenar os contatos
        HashMap<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Menu principal
        do {
            System.out.println("\nAgenda de Contatos:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Listar Contatos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            switch (opcao) {
                case 1:
                    adicionarContato(contatos, scanner);
                    break;
                case 2:
                    removerContato(contatos, scanner);
                    break;
                case 3:
                    buscarContato(contatos, scanner);
                    break;
                case 4:
                    listarContatos(contatos);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    // Método para adicionar contato
    public static void adicionarContato(HashMap<String, String> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número de telefone: ");
        String telefone = scanner.nextLine();
        contatos.put(nome, telefone);
        System.out.println("Contato adicionado com sucesso.");
    }

    // Método para remover contato
    public static void removerContato(HashMap<String, String> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja remover: ");
        String nome = scanner.nextLine();
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Método para buscar um contato pelo nome
    public static void buscarContato(HashMap<String, String> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja buscar: ");
        String nome = scanner.nextLine();
        if (contatos.containsKey(nome)) {
            System.out.println("Nome: " + nome + " - Telefone: " + contatos.get(nome));
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Método para listar todos os contatos
    public static void listarContatos(HashMap<String, String> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (HashMap.Entry<String, String> contato : contatos.entrySet()) {
                System.out.println("Nome: " + contato.getKey() + " - Telefone: " + contato.getValue());
            }
        }
    }
}
