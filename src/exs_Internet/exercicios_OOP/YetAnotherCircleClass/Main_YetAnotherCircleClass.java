package exs_Internet.exercicios_OOP.YetAnotherCircleClass;

public class Main_YetAnotherCircleClass {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println(circle);

        //Circle c2 = new Circle(); //por que da erro?
        //System.out.println(c2);

        System.out.println("Radius is: "+circle.getRadius());
        System.out.println("Area is: "+circle.getArea());
        System.out.println("Circumference is: "+circle.getCircumference());


        //o que fazer daqui pra frente? -> como manipular o Main?
    }
}
