import java.sql.SQLOutput;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite seu email: ");
        String email = input.nextLine();
        System.out.print("Digite uma senha: ");
        String senha = input.nextLine();
        System.out.println("Sua conta foi criada com sucesso! " + nome);
        System.out.println("Entre com sua conta.");
        System.out.print("Email: ");
        String email_Login = input.nextLine();
        System.out.print("Senha: ");
        String senha_login = input.nextLine();
        if (senha.equals(senha_login) && email.equalsIgnoreCase(email_Login)) {
            System.out.println("Login feito com sucesso!");
        } else {
            System.out.println("Credenciais incorretas, tente novamente:(");
        }



    }
}
