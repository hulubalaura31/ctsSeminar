package ro.ase.cts.gr1085.lab07;

public class Main {
    public static void main(String[] args) {
        MasinaSimpla masinaSimpla = new MasinaSimpla();
        masinaSimpla.schimbaCuloare();
        System.out.println("---------------------------------------------------");
        MasinaSuper masinaSuper = new MasinaSuper(masinaSimpla);
        masinaSuper.schimbaCuloare();

    }
}
