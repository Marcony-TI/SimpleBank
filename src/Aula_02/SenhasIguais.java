import java.util.Scanner;

public class SenhasIguais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String Senha = input.nextLine();
        System.out.println("Confirme sua senha: ");
        String Confirmacao = input.nextLine();
        boolean comparacao = Senha.equals(Confirmacao);
        System.out.println("As senhas coincidem? " + comparacao);
    }
}
