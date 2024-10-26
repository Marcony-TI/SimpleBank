package exercicios_03;

public class Mostrar_Pares_100 {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 100:");

        // Loop que percorre de 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

