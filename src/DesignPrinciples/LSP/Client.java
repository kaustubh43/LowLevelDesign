package DesignPrinciples.LSP;

public class Client {
    public static void main(String[] args) {

        CloudProvider aws = new AwsCloud();
        String urlAWS = aws.uploadToBlobStore();

        // Make a call at the URL to fetch this file.
        // byte[] fileBytes = requests.call(url);

        CloudProvider gcp = new GcpCloud();
        String urlGCP = gcp.uploadToBlobStore();

        // Make a call at the URL to fetch this file.
        // byte[] fileBytes = requests.call(urlGCP);

        CloudProvider local = new LocalStorage();
        String urlLocal = local.uploadToBlobStore();
        // Make a call at the URL to fetch this file.
        // byte[] fileBytes = requests.call(urlLocal);          // This will call issues since requests cant call on local address

        // This violates Liskov's Substitution principle.

    }
}
