package exs_arrayList.ex_livroLivraria;

public class LivroLivraria {
    private String titulo;
    private String autor;
    private int isbn;
    private String genero;
    private float preco;

    public LivroLivraria(){ }

    public LivroLivraria(String titulo, String autor, int isbn, String genero, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getGenero() {
        return genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String imprimir(){
        return "Titulo: " + titulo + "\nAutor: " + autor +
                "\nISBN: " + isbn + "\nGenero: " + genero
                + String.format("\nPreço: R$ %.2f \n",preco);
    }
}

