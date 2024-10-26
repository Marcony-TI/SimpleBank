package exercicios_03;

import com.sun.tools.javac.Main;
import java.util.Scanner;

public class Impar_Par {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("Digite um número inteiro(Z) diferente de zero: ");


        while (!input.hasNextInt()) {//sempre que o usuario inserir um numero não inteiro
            System.out.print("Número inválido, tente um numero inteiro(Z): ");
            input.next(); //Descartar entrada do usuario inválida
        }

        n = input.nextInt();

        while (n == 0) {
            System.out.print("Número inválido, digite um número diferente de zero:");

            while (!input.hasNextInt()) {//sempre que o usuario inserir um numero não inteiro
                System.out.print("Número inválido, tente um numero inteiro(Z): ");
                input.next(); //Descartar entrada do usuario inválida
            }
            n = input.nextInt();
        }

        switch (n % 2) {
              case 0:
                  System.out.println(n + " é par.");
                  break;

              default:
                  System.out.println(n + " é impar.");
        }
    }
}
