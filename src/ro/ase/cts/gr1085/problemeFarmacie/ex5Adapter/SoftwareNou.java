package ro.ase.cts.gr1085.problemeFarmacie.ex5Adapter;

public class SoftwareNou implements ISoftwareNou{
    private String medicamentDorit;
    private int stoc;
    public SoftwareNou(){
        this.medicamentDorit = "";
        this.stoc = 100;
    }

    @Override
    public boolean verificaStocPentruMedicament(String id, int nrMedicamente) {
        if(nrMedicamente < stoc) {
            this.medicamentDorit = id;
            return true;
        }else{
            return false;
        }
    }
}
