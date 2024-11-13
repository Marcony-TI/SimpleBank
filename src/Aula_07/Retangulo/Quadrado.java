package Aula_07.Retangulo;

public class Quadrado extends Retangulo_Forms {
    public Quadrado (float base1, float base2) {
        super(base1, base2);
    }

    public Quadrado() {
        super();
    }

    public void showArea () {
        System.out.println("");
        System.out.println("________________________");
        System.out.println(" Area do quadrado: " + getArea() + "m²");
        System.out.println("________________________");
    }

    public void showPerimetro () {
        System.out.println("");
        System.out.println("________________________");
        System.out.println(" Perimetro do quadrado: " + getPerimetro() + "m");
        System.out.println("________________________");
    }

}
