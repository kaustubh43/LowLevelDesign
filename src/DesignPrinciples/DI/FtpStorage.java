package DesignPrinciples.DI;

public class FtpStorage extends Storage {
    @Override
    public void write(String message) {
        System.out.println("Saving to FTP:" + message);
    }
}
