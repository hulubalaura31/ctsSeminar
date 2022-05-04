package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class MedicamentDurere implements Medicament{
    @Override
    public void getDenumire() {
        System.out.println("Medicament de durere care ");
    }

    @Override
    public void getCost() {
        System.out.println("costa 15 lei");
    }
}
