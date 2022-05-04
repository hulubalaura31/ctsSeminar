package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class RacealaFactory implements Factory{
    @Override
    public Medicament afisareDetalii() {
        return new MedicamentRaceala();
    }
}
