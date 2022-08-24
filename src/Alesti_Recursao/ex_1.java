package Alesti_Recursao;

public class ex_1 {
    private static int somRecursivo(int n) {
        if (n == 0) return 0;
        return somRecursivo(n - 1) + n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(somRecursivo(n));
    }
}

