package DesignPrinciples.SRP;

public class AreaCalculator {
    public void calculateArea(String type, int length){
        if(type == "circle"){
            System.out.println(Math.PI * length * length);
        }
        else if(type == "rectangle"){
            System.out.println(length * length);
        }
        else if(type == "square"){
            System.out.println(length * length);
        }
    }
}