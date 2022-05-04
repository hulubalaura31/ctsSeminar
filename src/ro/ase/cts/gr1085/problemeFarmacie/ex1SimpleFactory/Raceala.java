package ro.ase.cts.gr1085.problemeFarmacie.ex1SimpleFactory;

public class Raceala implements IMedicament{
    @Override
    public void getDenumire() {
        System.out.println("Medicament de raceala");
    }

    @Override
    public void getPret() {
        System.out.println(" 20");
    }
}
