package exs_Internet.exercicios_OOP.the_account_class;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){ //devo criar dois construtores?
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    @Override
    public String toString(){
        return "ACCOUNT - [ID]:"+id+ " [NAME]: "+name +" [BALANCE]: "+balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){ //revisar!
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <= balance){
            balance = balance - amount;
            return balance;
        }
        else{
            System.out.println("Amount exceeded balance!");
             return balance;
        }
    }
    /*public int transferTo(Account another, int amount){
        if(amount <= balance) {
            //
        }
        else {
            System.out.println("Amount exceeded balance!");
            return balance;
        }

    }*/
}
