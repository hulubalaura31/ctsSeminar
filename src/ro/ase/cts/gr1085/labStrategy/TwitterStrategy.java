package ro.ase.cts.gr1085.labStrategy;

public class TwitterStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
