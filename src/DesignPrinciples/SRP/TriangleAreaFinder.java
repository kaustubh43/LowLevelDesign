package DesignPrinciples.SRP;

public class TriangleAreaFinder implements AreaFinder {
    @Override
    public void findArea(int length) {
        System.out.println("Triangle Area" + length * Math.sqrt(3) / 4 );
     }
}
