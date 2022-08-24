package exs_Internet.exercicios_OOP.exercicios_arrays;

import java.util.Scanner;
/*.lenght -> número de posicoes do array
        for(int i: valores){
            System.out.println(i);
        }*/
public class ex_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição "+ i+": ");
            vetorA[i] = in.nextInt();

            vetorB[i] = vetorA[i] * 2;
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
