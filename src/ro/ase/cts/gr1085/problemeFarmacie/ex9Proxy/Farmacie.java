package ro.ase.cts.gr1085.problemeFarmacie.ex9Proxy;

public class Farmacie implements Sistem{
    private Cumparator cumparator;
    public Farmacie(Cumparator cumparator){
        this.cumparator = cumparator;
    }

    public Cumparator getCumparator() {
        return cumparator;
    }

    public void setCumparator(Cumparator cumparator) {
        this.cumparator = cumparator;
    }

    @Override
    public void cumparaMedicamente() {
            System.out.println("poate cumpara");
    }
}
