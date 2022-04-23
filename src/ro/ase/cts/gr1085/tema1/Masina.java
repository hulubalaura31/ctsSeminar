package ro.ase.cts.gr1085.tema1;

public class Masina implements InterfataMasina{
    private String culoare;
    private final int viteza;

    public Masina(int viteza) {
        this.viteza = viteza;
    }

    @Override
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void statusMasina() {
        System.out.println("Culoare: " + this.culoare + " - viteza: " + this.viteza + " -  hashCode: " + this.hashCode() );
    }
}
