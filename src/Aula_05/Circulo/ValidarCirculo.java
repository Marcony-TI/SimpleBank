package Aula_05.Circulo;
    import java.util.ArrayList;
    import java.util.Scanner;

public class ValidarCirculo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Circulo> Circulos = new ArrayList<>();

        while (true) {
            Circulo ra = Circulo.cadastrar();
            Circulos.add(ra);

            System.out.println("Deseja sair? 0");
            int option = scanner.nextInt();
            if (option == 0) break;
        }
        ;

        for (Circulo ra : Circulos) {
            ra.visualizarCirculo();
        }
        ;
    }
}
