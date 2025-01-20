package DesignPrinciples.LSP;

public class LocalStorage implements CloudProvider{
    @Override
    public String uploadToBlobStore() {
        return "C:/BlobStore/";
    }

    @Override
    public void createLambdaMethod() {

    }
}
