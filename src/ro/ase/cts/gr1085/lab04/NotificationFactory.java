package ro.ase.cts.gr1085.lab04;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        }
        if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}
