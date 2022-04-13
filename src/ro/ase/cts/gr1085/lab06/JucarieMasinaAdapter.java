package ro.ase.cts.gr1085.lab06;

public class JucarieMasinaAdapter implements JucarieMobila {
    Masina masina;

    public void JucarieMasinaAdapter(Masina masina){
        this.masina = masina;
    }

    @Override
    public void seDeplaseaza() {
        this.masina.ruleaza();
    }

    @Override
    public void emiteSunete() {
        this.masina.claxoneaza();
    }
}
