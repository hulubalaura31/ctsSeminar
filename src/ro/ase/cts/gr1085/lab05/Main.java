package ro.ase.cts.gr1085.lab05;

public class Main {
    public static void main(String[] args) throws Exception {
        InginerAuto a1 = new InginerAuto("Camion");
        a1.buildAutomobil();
        Automobil camion = a1.getAutomobil();
        System.out.println(camion);

        InginerAuto a2 = new InginerAuto("Autoturism");
        a2.buildAutomobil();
        Automobil automobil = a2.getAutomobil();
        System.out.println(automobil);
    }
}

