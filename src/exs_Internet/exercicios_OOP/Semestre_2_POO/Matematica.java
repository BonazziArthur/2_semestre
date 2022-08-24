package exs_Internet.exercicios_OOP.Semestre_2_POO;
/* Na classe Matematica deve haver um método de classe (static) que recebe 3 parâmetros: dividendo (inteiro), divisor (inteiro), precisao (inteiro).

 Este método retorna uma String com o resultado da divisão do dividendo pelo divisor, com tantas casas decimais significativas quanto a precisão -> FAZER!.
 Se a divisão não for possível, retorna null OK!!!!!!.
Exemplo 1: dividendo: 10, divisor: 4, precisão: 10, string de retorno: "2.5"
Exemplo 2: dividendo: 10, divisor: 0, precisão: 10, string de retorno: null
Exemplo 3: dividendo: 100, divisor: 3, precisão: 20, string de retorno: "33.33333333333333333333"

 */
import java.text.DecimalFormat;

public class Matematica {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static String resultadoDiv(int dividendo, int divisor, int precisao) {
        if (dividendo / divisor == 0) {
            return null;
        }
        else if (precisao == 10) {
            //DecimalFormat("0.00");
            String resultado = df.format(String.valueOf(dividendo / divisor));
            return resultado;
        }
        else {
            return null;
        }
    }
}
