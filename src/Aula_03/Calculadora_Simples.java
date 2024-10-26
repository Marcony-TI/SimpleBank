package exercicios_03;

import java.util.Scanner;

public class Calculadora_Simples {
    public static void main(String[] args) {
        // Objeto da classe Scanner para captura de dados do teclado do usuário
        Scanner input = new Scanner(System.in);

        // Interface de introdução
        System.out.println("####################");
        System.out.println("Calculadora Simples");
        System.out.println("####################");
        System.out.println(" ");

        // Solicita e valida o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        float n1 = obterNumeroValido(input);

        // Exibe o menu de operadores
        System.out.println("OPERADORES");
        System.out.println("0- Sair");
        System.out.println("1- Adição (+)");
        System.out.println("2- Subtração (-)");
        System.out.println("3- Multiplicação (x)");
        System.out.println("4- Divisão (/)");
        System.out.println(" ");

        // Variável para armazenar o operador
        int operador = -1;

        // Loop para garantir que a entrada seja um número inteiro válido para a escolha do operador
        while (operador < 0 || operador > 4) {
            System.out.print("Escolha um operador: ");
            if (!input.hasNextInt()) {  // Verifica se é um número inteiro
                System.out.print("Valor inválido, tente novamente: ");
                input.next(); // Descarta a entrada inválida
            } else {
                operador = input.nextInt();  // Armazena o operador
                if (operador < 0 || operador > 4) {
                    System.out.println("Operador inválido, escolha entre 0 e 4.");
                }
            }
        }

        // Se o operador for 0, o programa encerra
        if (operador == 0) {
            System.out.println("Você escolheu sair. Programa encerrado.");
            return;
        }

        // Solicita e valida o segundo valor
        System.out.print("Digite o segundo valor: ");
        float n2 = obterNumeroValido(input);

        // Realiza a operação com base no operador escolhido
        float resultado = 0;
        switch (operador) {
            case 1:  // Adição
                resultado = n1 + n2;
                System.out.println("Resultado: " + n1 + " + " + n2 + " = " + resultado);
                break;
            case 2:  // Subtração
                resultado = n1 - n2;
                System.out.println("Resultado: " + n1 + " - " + n2 + " = " + resultado);
                break;
            case 3:  // Multiplicação
                resultado = n1 * n2;
                System.out.println("Resultado: " + n1 + " * " + n2 + " = " + resultado);
                break;
            case 4:  // Divisão
                // Verifica se o segundo número não é zero antes de dividir
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + n1 + " / " + n2 + " = " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
        }
    }

    // Função auxiliar para validar e obter um número float
    public static float obterNumeroValido(Scanner input) {
        while (!input.hasNextFloat()) {
            System.out.print("Valor inválido, tente um número válido: ");
            input.next(); // Descarta a entrada inválida
        }
        return input.nextFloat();  // Retorna o número válido
    }
}