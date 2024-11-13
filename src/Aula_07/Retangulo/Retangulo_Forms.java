package Aula_07.Retangulo;
import java.util.Scanner;
public class Retangulo_Forms {
    private float base1 = 0;
    private float base2 = 0;

    Scanner scanner = new Scanner(System.in);

    // Construtor vazio
    public Retangulo_Forms() {
    }

    // Construtor com parâmetros
    public Retangulo_Forms(float base1, float base2) {
        this.base1 = base1;
        this.base2 = base2;
    }


    public float getArea () {
        return (base1 * base2);
    }

    public float getPerimetro () {
        return (base1 + base2)*2;
    }

    public void setBase1 () {
        System.out.print("Digite um valor para primeira base: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Valor inválido, tente um número válido: ");
            scanner.next(); // Descarta a entrada inválida
        }
        this.base1 = scanner.nextFloat();

    }

    public void setBase2 () {
        System.out.print("Digite um valor para segunda base: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Valor inválido, tente um número válido: ");
            scanner.next(); // Descarta a entrada inválida
        }
        this.base2 = scanner.nextFloat();

    }


}
