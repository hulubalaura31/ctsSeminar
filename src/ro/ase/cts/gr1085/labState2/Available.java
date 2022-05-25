package ro.ase.cts.gr1085.labState2;

public class Available implements State{
    @Override
    public void doAction() {
        System.out.println("State changed to: Available");
    }
}
