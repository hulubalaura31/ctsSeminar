package ro.ase.cts.gr1085.problemeFarmacie.ex8Composite;

public class Subsectiune implements  IMedicament{
    private String tipSubsectiune;
    public Subsectiune(String tipSubsectiune){
        this.tipSubsectiune = tipSubsectiune;
    }
    @Override
    public void afiseazaInformatii() {
        System.out.println(this.tipSubsectiune);
    }
}
