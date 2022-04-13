package ro.ase.cts.gr1085.lab06;

public class MasinaJucarieAdapter implements Masina{
    JucarieMobila masina;

    public MasinaJucarieAdapter(JucarieMobila masina){
        this.masina = masina;
    }

    @Override
    public void claxoneaza() {
        this.masina.emiteSunete();
    }

    @Override
    public void ruleaza() {
        this.masina.seDeplaseaza();
    }
}
