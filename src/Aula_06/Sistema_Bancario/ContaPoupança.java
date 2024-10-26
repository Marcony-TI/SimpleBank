package Aula_06.Sistema_Bancario;

public class ContaPoupança extends Conta{
    double rendimento = 0.13;
    public ContaPoupança (Cliente titular, double saldo) {
        super(titular, saldo);
    }

    public void aplicarRendimento() {
        double novoSaldo = getSaldo() * (1 + rendimento);
        depositar(novoSaldo - getSaldo());
    }



}
