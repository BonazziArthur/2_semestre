package exs_Internet.exercicios_OOP.The_Employee_Class;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employee: [ID] - " + id + " [Name] - " + firstName +" "+ lastName + " [Salary] - " + salary;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return "First Name "+firstName +" Last Name "+lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        int annualSalary;
        return annualSalary = salary * 12;
    }
    /*public int raiseSalary(int percent){
        percent =
        return percent = salary + (salary * percent);
    }*/

}
