import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu peso (Kg):");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura (M):");
        double altura = input.nextDouble();
        double IMC_v = peso / Math.pow(altura, 2);
        System.out.print("Seu IMC é " + IMC_v);

    }
}
