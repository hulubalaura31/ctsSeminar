package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class Main {
    public static void main(String[] args){
        Factory factory = Producer.getMedicament("body");
        Medicament medicament = factory.afisareDetalii();
        medicament.getCost();
        medicament.getDenumire();
    }
}
