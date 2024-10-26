package Aula_04;

import java.util.Scanner;

public class Media_Notas_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        // Recebendo as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido. Tente novamente.");
                scanner.next(); // Descartar entrada inválida
                System.out.print("Digite a nota " + (i + 1) + ": ");
            }
            notas[i] = scanner.nextDouble();
            soma += notas[i]; // Somando as notas
        }

        // Calculando a média
        double media = soma / notas.length;

        // Exibindo a média
        System.out.println("A média das notas é: " + media);
    }
}
