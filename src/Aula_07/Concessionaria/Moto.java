package Aula_07.Concessionaria;

public class Moto extends Veiculo {
    private String cilindrada;
    private String partida;
    public Moto(String marca, String modelo, String ano, String cilindrada, String partida) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
        this.partida = partida;
    }

    public String getcilindrada() {
        return cilindrada;
    }

    public void setcilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getpartida() {
        return partida;
    }

    public void setpartida(String partida) {
        this.partida = partida;
    }

    public void exibirEspecificacoes () {
        super.exibirEspecificacoes();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Partida: " + partida);
    }
   
}
