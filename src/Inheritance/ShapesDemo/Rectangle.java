package Inheritance.ShapesDemo;

import java.util.concurrent.ConcurrentHashMap;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(int positionX, int positionY, String fillColor, String borderColor, double length, double width) {
        super(positionX, positionY, fillColor, borderColor);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();
    int valB = cmap.putIfAbsent("valB", 5);
}
