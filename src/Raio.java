import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");
        double raio = in.nextDouble();

        System.out.println(Circ(raio));
    }

    public static double Circ(double raio){
        double circ = Math.PI* Math.pow(raio,2);
        return circ;

    }
}
