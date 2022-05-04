package ro.ase.cts.gr1085.problemeFarmacie.ex1SimpleFactory;

public class MedicamentFactory {
    public  IMedicament getMedicament(Categorie categorie){
        if(categorie == null){
            return null;
        }

        switch (categorie){
            case Durere:
                return  new Durere();
            case Body:
                return new Body();
            case Raceala:
                return new Raceala();
            default:
                throw new IllegalStateException("Unexpected value: " + categorie);
        }
    }
}
