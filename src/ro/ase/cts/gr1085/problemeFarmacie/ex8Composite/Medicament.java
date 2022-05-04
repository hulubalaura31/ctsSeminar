package ro.ase.cts.gr1085.problemeFarmacie.ex8Composite;

public class Medicament implements IMedicament{
    private String substante;
    public Medicament(String substante){
        this.substante = substante;
    }
    @Override
    public void afiseazaInformatii() {
        System.out.println(this.substante);
    }
}
