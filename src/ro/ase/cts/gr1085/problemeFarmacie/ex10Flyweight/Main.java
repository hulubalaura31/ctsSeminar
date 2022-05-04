package ro.ase.cts.gr1085.problemeFarmacie.ex10Flyweight;

public class Main {
    public static void main(String[] args){
        FarmacieFactory factory = new FarmacieFactory();
       factory.getIstoric("Ana").getReteta(new Reteta(1,15,3));
    }
}
