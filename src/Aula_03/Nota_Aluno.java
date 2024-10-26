package Aula_03;

import java.util.Scanner;


public class Nota_Aluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita e valida a nota do aluno
        System.out.print("Digite a nota do aluno (0 a 10): ");
        float nota = obterNotaValida(input);

        // Conversão para um valor inteiro arredondado
        int categoria = (int) nota; // Considera apenas a parte inteira da nota

        // Avaliação do aluno usando switch
        switch (categoria) {
            case 0: case 1: case 2: case 3:
                System.out.println("O aluno está reprovado.");
                break;
            case 4: case 5: case 6:
                System.out.println("O aluno está em recuperação.");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("O aluno está aprovado.");
                break;
            default:
                System.out.println("Nota inválida."); // Caso seja uma nota fora do intervalo
        }
    }

    // Função auxiliar para validar a entrada de nota
    public static float obterNotaValida(Scanner input) {
        float nota;
        do {
            while (!input.hasNextFloat()) {
                System.out.print("Valor inválido, tente um número entre 0 e 10: ");
                input.next(); // Descarta entrada inválida
            }
            nota = input.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.print("Nota fora do intervalo, digite novamente: ");
            }
        } while (nota < 0 || nota > 10);  // Garante que a nota esteja entre 0 e 10

        return nota;
    }
}