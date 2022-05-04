package ro.ase.cts.gr1085.problemeFarmacie.ex9Proxy;

public class Cumparator {
    private boolean areRetata;
    private String nume;

    public Cumparator(boolean areRetata, String nume) {
        this.areRetata = areRetata;
        this.nume = nume;
    }

    public boolean isAreRetata() {
        return areRetata;
    }

    public void setAreRetata(boolean areRetata) {
        this.areRetata = areRetata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
