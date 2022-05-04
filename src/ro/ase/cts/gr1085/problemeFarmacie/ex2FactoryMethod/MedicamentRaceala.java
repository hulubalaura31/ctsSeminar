package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class MedicamentRaceala implements Medicament{
    @Override
    public void getDenumire() {
        System.out.println("Medicament de raceala care ");
    }

    @Override
    public void getCost() {
        System.out.println("costa 20 de lei");
    }
}
