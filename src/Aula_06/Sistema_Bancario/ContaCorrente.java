package Aula_06.Sistema_Bancario;

public class ContaCorrente extends Conta {
    private double taxaManuntencao = 12.0;

    public ContaCorrente (Cliente titular, double saldo) {

        super(titular, saldo);
    }

    public void cobrarTaxa () {

        sacar(taxaManuntencao);
    }

}
