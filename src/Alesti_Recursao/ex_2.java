package Alesti_Recursao;

public class ex_2 {
    private static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String st = "Andre";
        System.out.println(reverseString(st));
    }
}
