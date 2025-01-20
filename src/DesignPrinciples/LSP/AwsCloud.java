package DesignPrinciples.LSP;

public class AwsCloud implements CloudProvider{
    @Override
    public String uploadToBlobStore() {
        System.out.println();
        return "https://s3-us-west-2.amazonaws.com";
    }

    @Override
    public void createLambdaMethod() {

    }
}
