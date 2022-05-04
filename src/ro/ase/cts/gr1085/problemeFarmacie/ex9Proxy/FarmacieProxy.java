package ro.ase.cts.gr1085.problemeFarmacie.ex9Proxy;

public class FarmacieProxy implements Sistem{
    private Farmacie farmacie;
    public FarmacieProxy(Farmacie farmacie){
        this.farmacie = farmacie;
    }

    public FarmacieProxy(Cumparator cumparator){
        this.farmacie = new Farmacie(cumparator);
    }

    @Override
    public void cumparaMedicamente() {
        if(farmacie.getCumparator().isAreRetata()) {
            farmacie.cumparaMedicamente();
        }else{
            System.out.println("nu poate cumpara");
        }
    }
}
