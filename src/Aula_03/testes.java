package exercicios_03;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("Digite um número inteiro (Z) diferente de zero: ");

        // Verifica se a entrada é um número inteiro
        while (!input.hasNextInt()) {
            System.out.print("Número inválido, tente um número inteiro (Z): ");
            input.next(); // Descarta a entrada inválida
        }

        n = input.nextInt();

        // Verifica se o número é diferente de zero
        while (n == 0) {
            System.out.print("Número inválido, digite um número diferente de zero:");
            switch (n % 2) {
                case 0:
                    System.out.println(n + " é par.");
                    break;

                default:
                    System.out.println(n + " é ímpar.");
            }
        }
    }
}