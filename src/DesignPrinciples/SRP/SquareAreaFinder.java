package DesignPrinciples.SRP;

public class SquareAreaFinder implements AreaFinder {
    @Override
    public void findArea(int length) {
        System.out.println("Square area " + length * length);
    }
}
