package exs_Internet.exercicios_OOP.The_Employee_Class;

public class Main_The_Employee_Class {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1967, "Arthur", "Bonazzi", 1000);
        System.out.println(employee1);

        employee1.setSalary(850);
        System.out.println(employee1);

        System.out.println("ID is "+employee1.getId());
        System.out.println("First Name is "+employee1.getFirstName());
        System.out.println("Last name is "+employee1.getLastName());
        System.out.println("Salary is: "+employee1.getSalary());

        System.out.println("Name is "+employee1.getName());
        System.out.println("Annual salary is "+employee1.getAnnualSalary());

        //testar o raise salary
    }
}
