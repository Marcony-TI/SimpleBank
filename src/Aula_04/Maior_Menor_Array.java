package Aula_04;
import java.util.ArrayList;
import java.util.Scanner;

public class Maior_Menor_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operador = 0;
        ArrayList<Integer> lista = new ArrayList<>();


        while (true) {
            System.out.println("1 - Adicionar Número.");
            System.out.println("2 - Encerrar.");
            System.out.print("OPERADOR: ");

            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Operador inválido, tente");
                System.out.println("1 - Adicionar Número.");
                System.out.println("2 - Encerrar.");
                System.out.println("OPERADOR: ");
            }

            operador = scanner.nextInt();

            int numero = 0;

            if (operador == 1) {
                System.out.print("Digite um número: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Valor inválido, tente números inteiros.");
                    scanner.next();
                    System.out.println("Digite um número: ");
                };

                numero = scanner.nextInt();
                lista.add(numero);

                System.out.println("Número " + numero + " adicionado!");

            } else if (operador == 2) {
                if (lista.isEmpty()) {
                    System.out.println("Nenhum número foi adicionado, PROGRAMA ENCERRADO!");
                    break;
                } else {
                    int Maior = lista.get(0);
                    int Menor = lista.get(0);

                    for (int num : lista) {
                        if (num > Maior) {
                            Maior = num;
                        }

                        if (num < Menor) {
                            Menor = num;
                        }
                    }
                    System.out.println("O maior número é " + Maior);
                    System.out.println("O menor número é " + Menor);

                }
                break;

            } else {
                System.out.println("Operador inválido, tente novamente.");
                System.out.println("1 - Adicionar Número.");
                System.out.println("2 - Encerrar.");
                System.out.println("OPERADOR: ");
            }
        }
    }
}
