package exercicios_03;

import java.util.Scanner;

public class Média_Notas_Aluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas = new float[4];
        float soma = 0;

        // Recebendo 4 notas com validação de entrada
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + " (de 0 a 10): ");

            // Validação contínua para valores válidos
            boolean entradaValida = false;
            while (!entradaValida) {
                if (!input.hasNextFloat()) {
                    System.out.print("Entrada inválida! Insira um número válido (de 0 a 10): ");
                    input.next(); // Descartar entrada inválida
                } else {
                    notas[i] = input.nextFloat();

                    // Verificar se a nota está no intervalo válido
                    if (notas[i] < 0 || notas[i] > 10) {
                        System.out.print("Nota fora do intervalo! Insira um valor entre 0 e 10: ");
                    } else {
                        entradaValida = true;
                    }
                }
            }

            soma += notas[i]; // Soma as notas válidas
        }

        // Calcula a média
        float media = soma / 4;
        System.out.println("Média final: " + media);

        // Verifica se está aprovado, reprovado ou em recuperação
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media < 4) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em recuperação.");
        }
    }
}
