package ro.ase.cts.gr1085.geeksForGeeks.Decorator;

public class PeppyPaneer extends Pizza {
    public PeppyPaneer() { description = "PeppyPaneer"; }
    @Override
    public int getCost() {
        return 100;
    }
}
