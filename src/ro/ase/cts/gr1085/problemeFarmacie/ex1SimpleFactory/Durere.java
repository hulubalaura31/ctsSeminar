package ro.ase.cts.gr1085.problemeFarmacie.ex1SimpleFactory;

public class Durere implements IMedicament{
    @Override
    public void getDenumire() {
        System.out.println("Medicament de durere");
    }

    @Override
    public void getPret() {
        System.out.println("15");
    }
}
