package ro.ase.cts.gr1085.tema1;

public class Masina implements InterfataMasina{
    private final String culoare;
    private  int numarRoti;

    public Masina(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void setNumarRoti(int numarRoti) {
        this.numarRoti = numarRoti;
    }

    @Override
    public void afiseaza() {
        System.out.println("Culoare: " + this.culoare + " - nr roti: " + this.numarRoti + " -  hashCode: " + this.hashCode() );
    }
}
