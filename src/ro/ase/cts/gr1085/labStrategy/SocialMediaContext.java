package ro.ase.cts.gr1085.labStrategy;

public class SocialMediaContext
{
    ISocialMediaStrategy messageStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.messageStrategy = smStrategy;
    }

    public void connect(String name)
    {
        messageStrategy.connectTo(name);
    }
}