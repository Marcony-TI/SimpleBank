package Aula_06.Sistema_Bancario;

public class BancoApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mark", "999.999.999-99", "mark@email.com");

        ContaCorrente contaCorrente = new ContaCorrente(cliente1, 1000.0);
        contaCorrente.cobrarTaxa();
        contaCorrente.sacar(200.0);
        contaCorrente.exibirInformacoes();
        contaCorrente.exibirHistoricoTransacoes(); //esse daqui é originalmente um método da classe transacoes

        ContaPoupança contaPoupança = new ContaPoupança(cliente1, 10000.0);
        contaPoupança.aplicarRendimento();
        contaPoupança.exibirInformacoes();

    }
}
