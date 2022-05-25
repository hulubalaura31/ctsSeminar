package ro.ase.cts.gr1085.labStrategy;

public class FacebookStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}

