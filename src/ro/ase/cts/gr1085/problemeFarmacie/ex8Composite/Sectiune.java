package ro.ase.cts.gr1085.problemeFarmacie.ex8Composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IMedicament{
    private List<IMedicament> medicamente = new ArrayList<>();

    public void adaugareCategorie(IMedicament medicament){
        if(medicament != null){
            this.medicamente.add(medicament);
        }else{
            throw new RuntimeException("operatia nu s-a putut realiza");
        }
    }

    public void stergereCategorie(IMedicament medicament){
        if(medicament != null){
            this.medicamente.remove(medicament);
        }else{
            throw new RuntimeException("operatia nu s-a putut realiza");
        }
    }

    @Override
    public void afiseazaInformatii() {
        for(IMedicament medicament : medicamente){
            medicament.afiseazaInformatii();
        }
    }
}
