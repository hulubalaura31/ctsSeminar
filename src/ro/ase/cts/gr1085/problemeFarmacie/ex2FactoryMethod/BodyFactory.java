package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;


public class BodyFactory implements Factory{
    @Override
    public Medicament afisareDetalii() {
        return new MedicamentBody();
    }
}
