package ro.ase.cts.gr1085.lab04;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("New email");
    }
}

