package exs_Internet.exercicios_OOP.author_book_myTurn;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn, String name, Author author, double price){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String toString(){
        return "{BOOK} [isbn = "+isbn+"name = "+name+ "["+author+"], price = +price+, qty = "+qty+"]";
    }

    public String getISBN(){
        return isbn;
    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    /*public String getAuthorName(){ //como faço pra importar o nome do autor da Classe autor pra essa? (apenas o nome)
        String
        return Author;
    }*/

}
