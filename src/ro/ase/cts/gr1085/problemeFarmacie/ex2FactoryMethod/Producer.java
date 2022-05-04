package ro.ase.cts.gr1085.problemeFarmacie.ex2FactoryMethod;

public class Producer {
    public static Factory getMedicament(String medicament){
        if(medicament == null){
            return null;
        }
        switch (medicament){
            case "raceala":
                return new RacealaFactory();
            case "body":
                return new BodyFactory();
            case "durere":
                return new DurereFactory();
            default:
               return null;
        }
    }
}
