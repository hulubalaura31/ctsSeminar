package ro.ase.cts.gr1085.problemeFarmacie.ex9Proxy;

public class Main {
    public static void main(String[] args){
        Cumparator cumparator = new Cumparator(true, "Ana");
        Cumparator cumparator1 = new Cumparator(false, "Ana");
        Farmacie farmacie = new Farmacie(cumparator);
        FarmacieProxy farmacieProxy = new FarmacieProxy(farmacie);
        farmacie.cumparaMedicamente();
        FarmacieProxy farmacieProxy1 = new FarmacieProxy(cumparator1);
        farmacieProxy1.cumparaMedicamente();

    }
}
