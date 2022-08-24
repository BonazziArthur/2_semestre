package exs_arrayList.ex_livroLivraria;

import java.util.ArrayList;

//classe para gerenciar arrayList de LivroLivraria
public class Acervo {
    private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();
    //get
    public static ArrayList<LivroLivraria> getListaLivros(){
        return listaLivros;
    }
    public static void adicionar(LivroLivraria l){
        listaLivros.add(l);
    }
}
