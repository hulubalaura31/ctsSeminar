package ro.ase.cts.gr1085.lab07;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Copac copac1= new Copac(2,"verde","mare",new PozitieXOY(3,4));
        System.out.println(copac1.getLocPlantare());
        Copac copac2= (Copac)copac1.clone();

        copac2.getTipCoroana();
    }
}
