package ro.ase.cts.gr1085.problemeFarmacie.ex8Composite;

public class Main {
    public static void main(String[] args){
        Sectiune sectiune = new Sectiune();
        Medicament medicament = new Medicament("medicament0");
        sectiune.adaugareCategorie(medicament);
        sectiune.adaugareCategorie(new Medicament("medicament1"));
        sectiune.adaugareCategorie(new Medicament("medicament2"));
        sectiune.adaugareCategorie(new Subsectiune("subsectiune1"));
        sectiune.afiseazaInformatii();
        sectiune.stergereCategorie(medicament);
        sectiune.afiseazaInformatii();
    }
}
