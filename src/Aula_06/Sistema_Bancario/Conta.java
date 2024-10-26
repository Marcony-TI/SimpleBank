package Aula_06.Sistema_Bancario;

import java.util.ArrayList;
import java.util.Date;

public class Conta {
    private Cliente titular;
    private double saldo;
    private ArrayList<Transacoes> historicoTransacoes;

    public Conta (Cliente titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
            Transacoes transacoes = new Transacoes("Entradas", valor);
            historicoTransacoes.add(transacoes);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar (double valor) {
        if (valor > 0) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
            Transacoes transacoes = new Transacoes("Saídas", valor);
            historicoTransacoes.add(transacoes);
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public double getSaldo () {
        return saldo;
    }

    public void exibirInformacoes () {
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + saldo);
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (Transacoes transacoes : historicoTransacoes) {
            transacoes.exibirDetalhes();
        }
    }
}
