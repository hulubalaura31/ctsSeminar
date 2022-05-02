package ro.ase.cts.gr1085.geeksForGeeks.Decorator;

public class FarmHouse extends Pizza {
    public FarmHouse() {  description = "FarmHouse"; }
    @Override
    public int getCost() {
        return 80;
    }
}
