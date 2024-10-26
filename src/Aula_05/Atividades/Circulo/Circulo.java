package Aula_05.Atividades.Circulo;
import java.util.Scanner;
//classe
public class Circulo {
    public static void main(String[] args) {

    }
        public double raio;


        //Metódo Construtor
        public Circulo (double raio) {

            this.raio = raio;

        }

        public double area () {
            return Math.PI*Math.pow(raio, 2);
        }

    public double perimetro () {
        return Math.PI*2*raio;
    }
        public static Circulo cadastrar () {

            Scanner scanner = new Scanner(System.in);




            System.out.print("Digite o valor do raio: ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido, tente novamente");
                scanner.next();
            }

            double raio = scanner.nextDouble();

            Circulo circulo = new Circulo(raio);

            return circulo;
        }

        public void visualizarCirculo() {
            System.out.println("Raio: " + this.raio);
            System.out.println("Área: " + area());
            System.out.println("Perimetro: " + perimetro());


        }
}
