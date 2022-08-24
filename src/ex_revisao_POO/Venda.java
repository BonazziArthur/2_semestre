package ex_revisao_POO;

public class Venda {
    private double valor;
    private Cliente cliente;
    private Carro carro;

    public Venda(double valor, Cliente cliente, Carro carro){
        this.valor = valor;
        this.cliente = cliente;
        this.carro = carro;
    }
    public double getValor(){
        return valor;
    }
}

