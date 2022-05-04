package ro.ase.cts.gr1085.problemeFarmacie.ex5Adapter;

public class AplicatieDeVanzare implements IAplicatieDeVanzare{
    private String medicamentDorit;
    private int stoc;
    public AplicatieDeVanzare(){
        this.medicamentDorit = "";
        this.stoc = 100;
    }
    @Override
    public void setareMedicament(String id) {
        this.medicamentDorit = id;
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
        if(nrMedicamente < stoc){
            return true;
        }else {
            return false;
        }
    }
}
