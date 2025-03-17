package DesignPatterns.Observer.Assignment.Utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String body) {
        System.out.println("Sending email");
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println();
    }

    public static void sendSMS(String subject, String body) {
        System.out.println("Sending SMS");
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println();
    }

    public static void sendPush(String subject, String body) {
        System.out.println("Sending Push");
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println();
    }
}
