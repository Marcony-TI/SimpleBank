package Aula_07.Concessionaria;
import java.util.List;
import java.util.ArrayList;
public class Concessionaria_System {
    private List<Veiculo> veiculos;

    public Concessionaria_System () {
        veiculos = new ArrayList<>();
    }

    public void cadastrar (Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veiculo cadastrado com sucesso: " + veiculo.getModelo());
    }

    public void exibirVeiculos () {
        for (Veiculo veiculo : veiculos) {
            System.out.println("----- Especificações do Veículo -----");
            veiculo.exibirEspecificacoes();
            System.out.println("-------------------------------------\n");
        }
    }
}
