package Inheritance.ShapesDemo;

public class Circle extends Shape{
    private double radius;

    public Circle(int positionX, int positionY, String fillColor, String borderColor, double radius) {
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
