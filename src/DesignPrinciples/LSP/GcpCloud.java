package DesignPrinciples.LSP;

public class GcpCloud implements CloudProvider{

    @Override
    public String uploadToBlobStore() {
        System.out.println("Uploading GCP Cloud");
        return "https://cloud.google.com";
    }

    @Override
    public void createLambdaMethod() {

    }
}
