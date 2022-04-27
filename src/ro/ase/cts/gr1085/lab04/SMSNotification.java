package ro.ase.cts.gr1085.lab04;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("New sms");
    }
}
