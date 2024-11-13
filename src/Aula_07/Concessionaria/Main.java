package Aula_07.Concessionaria;

public class Main {
    public static void main(String[] args) {
        Concessionaria_System concessionaria = new Concessionaria_System();

        Moto moto1 = new Moto("Honda", "CBR","2022", "600cc", "Eletrica");
        Carro carro1 = new Carro("Honda","Civic","2024","Flex", "4");

        concessionaria.cadastrar(moto1);
        concessionaria.cadastrar(carro1);

        concessionaria.exibirVeiculos();
    }
}
