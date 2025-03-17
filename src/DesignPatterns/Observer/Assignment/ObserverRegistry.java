package DesignPatterns.Observer.Assignment;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double price);
}
