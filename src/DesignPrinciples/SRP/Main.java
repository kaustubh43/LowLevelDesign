package DesignPrinciples.SRP;

public class Main {
    public static void main(String[] args) {

        // Area calculator which violates the SRP.
        new AreaCalculator().calculateArea("square", 5);

        // Area calculator which conforms to the SRP.
        AreaFinder a = new SquareAreaFinder();
        a.findArea(5);
    }
}
