package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class DurereFactory implements Factory{
    @Override
    public Medicament afisareDetalii() {
        return new MedicamentDurere();
    }
}
