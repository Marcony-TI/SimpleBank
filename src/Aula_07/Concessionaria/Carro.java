package Aula_07.Concessionaria;

public class Carro extends Veiculo {
    private String combustivel;
    private String portas;
    public Carro (String marca, String modelo, String ano, String combustivel, String portas) {
        super(marca, modelo, ano);
        this.combustivel = combustivel;
        this.portas = portas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public void exibirEspecificacoes () {
        super.exibirEspecificacoes();
        System.out.println("Combustível: " + combustivel);
        System.out.println("Portas: " + portas);
    }
}
