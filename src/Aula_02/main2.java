
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = input.next();
        System.out.println("Digite seu email:");
        String email = input.next();
        System.out.println("Olá " + nome + "! Seu email: " + email + " foi cadastrado.");
    }
}
