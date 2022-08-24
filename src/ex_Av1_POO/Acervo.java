package ex_Av1_POO;

import java.util.ArrayList;

public class Acervo {
    public boolean adicionaAlugavel(Alugavel itemAlugado){
        if(itemAlugado ){
            return true;
        }
        else {
            return false;
        }
    }
    public Alugavel pesquisaAlugavel(int codigo){
        if(codigo == itemAlugado){
            return itemAlugado + " " + codigo;
        }
        else {
            return null;
        }
    }
    public ArrayList<Alugavel> pesquisaAlugavel(String nome){
        if(nome.equalsIgnoreCase()){
            return Alugavel;
        }
        else {
            return null;
        }
    }
}
