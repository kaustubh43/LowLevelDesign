package AdvancedConcepts.Generics;

public class Pair<F, S>{
    private F first;
    private S second;

    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public static <X, Y> void doSomething(X first, Y second){
        System.out.println(first instanceof String);
        System.out.println(second instanceof String);
    }
}
