package exercicios_03;

import java.util.Scanner;
import java.util.Random;

public class Acerte_o_Numero {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Criação de um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Variável para armazenar a tentativa do jogador
        int palpite = 0;

        // Loop até que o jogador acerte o número
        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite (entre 1 e 100): ");

            // Captura a entrada do jogador
            palpite = input.nextInt();

            // Dá uma dica se o palpite foi maior ou menor que o número gerado
            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            }
        }

        // Mensagem de sucesso quando o jogador acerta
        System.out.println("Parabéns! Você acertou o número.");
    }
}
