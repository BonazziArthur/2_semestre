package exs_Internet.exercicios_OOP.author_book_myTurn;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String toString(){
        return "{AUTHOR} / [Name = "+name+" email = "+email+"]";
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
