package DesignPrinciples.DI;

public class WindowsShared extends Storage {
    @Override
    public void write(String message) {
        System.out.println("saving to windows");
    }
}
