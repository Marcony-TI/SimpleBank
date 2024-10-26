import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Um valor de 1 a 10");
        byte n1 = input.nextByte();
        if (n1 == 0) {
            System.out.println("Esse valor é ivalido, reinicie o programa.");
            System.exit(0);
        }
        System.out.println("Digite outro valor de 1 a 10");
        byte n2 = input.nextByte();
        if (n1 == 0) {
            System.out.println("Esse valor é ivalido, reinicie o programa.");
            System.exit(0);
        }
        System.out.println("Novamente Digite Um valor de 1 a 10");
        byte n3 = input.nextByte();
        if (n1 == 0) {
            System.out.println("Esse valor é ivalido, reinicie o programa.");
            System.exit(0);
        }
        System.out.println("OK... Mais uma vez, digite Um valor de 1 a 10");
        byte n4 = input.nextByte();
        if (n1 == 0) {
            System.out.println("Esse valor é ivalido, reinicie o programa.");
            System.exit(0);
        }
        int media = (n1+n2+n3+n4)/4;
        System.out.println("A média entre os valores das notas é: " + media);
    }
}
