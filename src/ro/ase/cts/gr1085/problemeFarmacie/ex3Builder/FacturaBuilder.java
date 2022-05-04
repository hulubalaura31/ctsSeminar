package ro.ase.cts.gr1085.problemeFarmacie.ex3Builder;

public class FacturaBuilder implements IBuilder{
    Factura factura;
    public FacturaBuilder(){
        this.factura = new Factura();
    }
    @Override
    public Factura build() {
        return factura;
    }

    public void setNrPungi(int nrPungi){
        this.factura.setNrPungi(nrPungi);
    }

    public void setCotaTVA(boolean cotaTVA){
        this.factura.setCotaTVA(cotaTVA);
    }

    public void setCardFidelitate(boolean cardFidelitate){
        this.factura.setCardFidelitate(cardFidelitate);
    }

    public void setPlataCuCard(boolean plataCuCard){
        this.factura.setPlataCuCard(plataCuCard);
    }
}
