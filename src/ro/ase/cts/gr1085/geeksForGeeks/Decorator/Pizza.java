package ro.ase.cts.gr1085.geeksForGeeks.Decorator;

public abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription()
    {
        return description;
    }

    public abstract int getCost();
}
