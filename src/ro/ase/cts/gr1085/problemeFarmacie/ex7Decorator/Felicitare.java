package ro.ase.cts.gr1085.problemeFarmacie.ex7Decorator;

public class Felicitare extends TipFoaie{
    Foaie foaie;
    public  Felicitare(Foaie foaie){
        this.foaie = foaie;
    }
    @Override
    public void afiseazaInformatii() {
        foaie.afiseazaInformatii();
        this.printeazaFelicitare();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani");
    }
}
