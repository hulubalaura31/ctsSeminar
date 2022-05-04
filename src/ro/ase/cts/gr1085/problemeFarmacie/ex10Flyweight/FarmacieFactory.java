package ro.ase.cts.gr1085.problemeFarmacie.ex10Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FarmacieFactory {
    private Map<String, Farmacie> istoric ;
    public FarmacieFactory(){
        this.istoric = new HashMap<String, Farmacie>();
    }
    public Farmacie getIstoric(String nume){
        Farmacie farmacie = istoric.get(nume);
        if(farmacie == null){
            farmacie = new Client("Ana", 12);
            istoric.put(nume,farmacie);
        }
        return farmacie;
    }
}
