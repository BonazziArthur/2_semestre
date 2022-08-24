/*package exs_Internet.exercicios_OOP.the_author_and_book;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    public Book (String name, Author[] author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book (String name, Author[] author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    @Override
    public String toString(){
        return "{Book} - [NAME]: "+name+" // {Authors} - "+author+" [PRICE]: "+price+" [QUANTITY]: "+qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
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
    /*public String getAuthorNames(){
        return "authorName1", "authorName2";
    }
}*/
