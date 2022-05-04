package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class MedicamentBody implements Medicament{
    @Override
    public void getDenumire() {
        System.out.println("Medicament de body care ");
    }

    @Override
    public void getCost() {
        System.out.println("costa 10 lei");
    }
}
