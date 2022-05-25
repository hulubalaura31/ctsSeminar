package ro.ase.cts.gr1085.labState2;

public class Main {

    public static void main(String[] args) {
        Seat s1 = new Seat(1);
        s1.reserveSeat();
        s1.occupySeat();
        s1.freeSeat();
        s1.freeSeat();
    }
}