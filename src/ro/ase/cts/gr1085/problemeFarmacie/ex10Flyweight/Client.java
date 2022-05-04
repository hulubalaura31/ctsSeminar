package ro.ase.cts.gr1085.problemeFarmacie.ex10Flyweight;

public class Client implements Farmacie{
    private String nume;
    private int nrAsigurare;

    public Client(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void getReteta(Reteta retete) {
        System.out.println(this.nume + " " + this.nrAsigurare + " " + retete.getNrReteta() + " " + retete.getNrMedicamente() + " " + retete.getSumeDePlata());
    }
}
