package ro.ase.cts.gr1085.problemeFarmacie.ex7Decorator;

public class FoaiePrintata extends Foaie{
    private String tipFoaie;

    public FoaiePrintata(){
        this.tipFoaie = "bon";
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(this.tipFoaie);
    }
}
