package DesignPrinciples.DI;

public class Client {
    public static void writeToStorage(Storage storage) {
        storage.write("write something");
    }

    public static void main(String[] args) {
        writeToStorage(new FtpStorage());
    }
}
