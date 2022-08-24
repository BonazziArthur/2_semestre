package ex_revisao_POO;

public class Main {
    public static void main(String[] args) {
        Carro carro1; //por que essa parte aqui?
        Cliente cliente1;
        Venda venda1;

        carro1 = new Carro("AAA-1A11"); //nos parameters eu coloco a informacao do construtor?
        cliente1 = new Cliente("Maria da Silva");
        venda1 = new Venda(900000.00, cliente1, carro1);
    }
}
