package exs_Internet.exercicios_OOP.exercicios_arrays;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i + ": ");
            vetorA[i] = in.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }



    }
}
