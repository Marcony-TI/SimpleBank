package Aula_06.Sistema_Bancario;
import java.util.Date;
public class Transacoes {
    private String tipo;
    private double valor;
    private Date date;

    public Transacoes (String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.date = new Date(); //registra a data da transação
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getDate() {
        return date;
    }

    public void exibirDetalhes () {
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + date);
    }


}
