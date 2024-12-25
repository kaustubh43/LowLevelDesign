package AdvancedConcepts.Generics;


public class Client {
    public static void main(String[] args){
        Pair p = new Pair("Aloha", 56d);
        System.out.println(p.getFirst() instanceof String);

        Pair.doSomething(5, "5");
    }
}
