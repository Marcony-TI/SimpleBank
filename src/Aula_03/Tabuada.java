package exercicios_03;

    import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário o número para a tabuada
        System.out.print("Digite um número para calcular a tabuada de 1 a 10: ");

        // Valida se a entrada é um número inteiro
        while (!input.hasNextInt()) {
            System.out.print("Entrada inválida, tente um número inteiro: ");
            input.next(); // Descarta entrada inválida
        }

        int numero = input.nextInt();

        // Imprime a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

