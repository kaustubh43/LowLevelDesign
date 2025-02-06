package DesignPatterns.Strategy;

public class PeakHourStrategy implements SlotFinderStrategy{
    @Override
    public Slot findSlot(Vehicle vehicle) {
        // Returns the farthest slot, so the closer ones are available sooner.
        return new Slot();
    }
}
