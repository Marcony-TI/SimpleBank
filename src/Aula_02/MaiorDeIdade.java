import java.security.DrbgParameters;
import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade para verificação: ");
        byte idade = input.nextByte();
        System.out.println("É maior de idade? " + (idade >= 18));
    }
}
