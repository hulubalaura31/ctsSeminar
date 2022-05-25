package ro.ase.cts.gr1085.labState2;

public class Occupied implements State{
    @Override
    public void doAction() {
        System.out.println("State changed to: Occupied");
    }
}
