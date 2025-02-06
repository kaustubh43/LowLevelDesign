package DesignPatterns.Strategy;

public class PriorrityStrategy implements SlotFinderStrategy{
    @Override
    public Slot findSlot(Vehicle vehicle) {
        // Give priority parking based on payment
        return new Slot();
    }
}
