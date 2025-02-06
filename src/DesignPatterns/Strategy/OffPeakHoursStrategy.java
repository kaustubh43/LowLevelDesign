package DesignPatterns.Strategy;

public class OffPeakHoursStrategy implements SlotFinderStrategy{
    @Override
    public Slot findSlot(Vehicle vehicle) {
        // Returns the nearest slot possible
        return new Slot();
    }
}
