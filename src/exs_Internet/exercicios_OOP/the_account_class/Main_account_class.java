package exs_Internet.exercicios_OOP.the_account_class;

public class Main_account_class {
    public static void main(String[] args) {
        Account account1 = new Account("1410", "Arthur", 88);
        System.out.println(account1);

        Account account2 = new Account("1410", "Cleber"); //como sabe que é o outro construtor e nao o com os 3 atributos?
        System.out.println(account2);

        System.out.println("ID: "+account1.getId());
        System.out.println("Name: "+account1.getName());
        System.out.println("Balance: "+account1.getBalance());

        account1.credit(100);
        System.out.println(account1);

        account1.debit(50);
        System.out.println(account1);

        account1.debit(500);
        System.out.println(account1);


        //Transfer to -> como fazer?

    }
}
