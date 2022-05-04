package ro.ase.cts.gr1085.problemeFarmacie.ex1SimpleFactory;

public class Body implements IMedicament{
    @Override
    public void getDenumire() {
        System.out.println("Medicament body");
    }

    @Override
    public void getPret() {
        System.out.println("30");
    }
}
