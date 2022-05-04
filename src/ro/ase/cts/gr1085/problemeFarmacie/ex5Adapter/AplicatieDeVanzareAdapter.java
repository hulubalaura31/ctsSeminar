package ro.ase.cts.gr1085.problemeFarmacie.ex5Adapter;

public class AplicatieDeVanzareAdapter implements ISoftwareNou{
    AplicatieDeVanzare aplicatieDeVanzare;
    public AplicatieDeVanzareAdapter(AplicatieDeVanzare aplicatieDeVanzare){
        this.aplicatieDeVanzare = aplicatieDeVanzare;
    }
    @Override
    public boolean verificaStocPentruMedicament(String id, int nrMedicamente) {
        if(aplicatieDeVanzare.verificareDisponibilitate(nrMedicamente)){
            aplicatieDeVanzare.setareMedicament(id);
            return true;
        }else {
            return false;
        }
    }
}
