package Aula_4;

import java.util.ArrayList;
import java.util.Scanner;

public class soma_Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int operador;

        System.out.println("Digite um valor inteiro (Z): ");

        while (true) {
            // Verifica se o valor inserido é um inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("Valor incorreto, tente um número inteiro.");
                scanner.next(); // Descartar a entrada inválida
            }
            int numero = scanner.nextInt();
            lista.add(numero);

            System.out.println("1 - para adicionar.");
            System.out.println("2 - para encerrar.");
            System.out.print("Operador: ");

            // Validação do operador
            while (true) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Valor inválido, tente novamente: ");
                    scanner.next(); // Descartar a entrada inválida
                }
                operador = scanner.nextInt();

                if (operador == 1) {
                    System.out.print("Digite um valor inteiro (Z): ");
                    break; // Volta para a entrada do número
                } else if (operador == 2) {
                    // Sai do loop principal
                    break;
                } else {
                    System.out.println("Tente um operador válido (1 OU 2): ");
                }
            }

            // Se o operador for 2, encerra o loop
            if (operador == 2) {
                break;
            }
        }

        // Calcula a soma
        int soma = 0;
        for (int numero : lista) {
            soma += numero;
            System.out.print(numero + ", ");
        }
        System.out.print("A soma dos valores da lista acima é: " + soma);
    }
}
