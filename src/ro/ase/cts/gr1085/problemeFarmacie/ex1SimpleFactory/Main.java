package ro.ase.cts.gr1085.problemeFarmacie.ex1SimpleFactory;

public class Main {
    public static void main(String[] args){
        MedicamentFactory medicamentFactory = new MedicamentFactory();
        IMedicament iMedicament = null;

            iMedicament = medicamentFactory.getMedicament(Categorie.Body);
            iMedicament.getDenumire();
            iMedicament.getPret();


    }
}
