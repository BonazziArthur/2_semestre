package exs_Internet.exercicios_OOP.YetAnotherCircleClass;

public class Circle {
    private double radius = 1.0;

    @Override
    public String toString() {
        return "CIRCLE [radius = "+radius+"]";
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    public double getCircumference() {
        double c = 2 * Math.PI * radius;
        return c;
    }
}
