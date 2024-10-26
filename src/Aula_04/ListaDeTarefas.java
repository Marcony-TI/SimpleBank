import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        // Menu principal
        while (true) {
            System.out.println("\nLista de Tarefas:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Listar Tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            // Verificar se a entrada é um número válido
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.next(); // Descartar entrada inválida
                System.out.print("Escolha uma opção: ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // Executar ações conforme a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa que deseja adicionar: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada.");
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover:");
                    listarTarefas(tarefas); // Exibir lista antes de remover
                    if (!tarefas.isEmpty()) {
                        while (!scanner.hasNextInt()) {
                            System.out.println("Entrada inválida. Digite o número da tarefa.");
                            scanner.next(); // Descartar entrada inválida
                        }
                        int numeroTarefa = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer
                        if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
                            tarefas.remove(numeroTarefa - 1);
                            System.out.println("Tarefa removida.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 3:
                    listarTarefas(tarefas); // Listar as tarefas
                    break;
                case 4:
                    System.out.println("Saindo... Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Escolha entre 1 e 4.");
            }
        }
    }

    // Método para listar as tarefas
    public static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            System.out.println("Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + " - " + tarefas.get(i));
            }
        }
    }
}