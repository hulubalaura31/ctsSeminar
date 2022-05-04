package ro.ase.cts.gr1085.problemeFarmacie.ex10Flyweight;

public class Reteta {
    private int nrReteta;
    private int sumeDePlata;
    private int nrMedicamente;

    public Reteta(int nrReteta, int sumeDePlata, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.sumeDePlata = sumeDePlata;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public int getSumeDePlata() {
        return sumeDePlata;
    }

    public void setSumeDePlata(int sumeDePlata) {
        this.sumeDePlata = sumeDePlata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", sumeDePlata=" + sumeDePlata +
                ", nrMedicamente=" + nrMedicamente +
                '}';
    }
}
