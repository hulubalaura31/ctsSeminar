package ro.ase.cts.gr1085.problemeFarmacie.ex7Decorator;

public class Main {
    public static void main(String[] args){
        Foaie foaie = new FoaiePrintata();
        foaie.afiseazaInformatii();
        foaie = new Felicitare(foaie);
        foaie.afiseazaInformatii();

    }
}
