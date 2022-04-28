package ro.ase.cts.gr1085.lab09;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements IAngajat{
    private String nume;
    private String codAngajat;
    private List<IAngajat> angajati = new ArrayList<IAngajat>();

    public Angajat(String nume, String codAngajat){
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.angajati = null;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("nume: "+ nume + " cod: " + codAngajat);
    }

    @Override
    public void adaugareSubordonat(IAngajat iAngajat) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereSubordonat(IAngajat iAngajat) {
        throw new UnsupportedOperationException();
    }
}
