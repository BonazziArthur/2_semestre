package exs_Internet.exercicios_OOP.Semestre_2_POO;

import java.util.Scanner;

public class Main_matematica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o dividendo: ");
        int dividendo = in.nextInt();
        System.out.println("Insira o divisor: ");
        int divisor = in.nextInt();
        System.out.println("Insira a precisão: ");
        int precisao = in.nextInt();

        System.out.println(Matematica.resultadoDiv(dividendo, divisor, precisao));
    }
}
