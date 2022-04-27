package ro.ase.cts.gr1085.recapitularePrototype;

public class Main {
    public static void main(String[] args){
        CloneFactory cloneFactory = new CloneFactory();
        Sheep sheep = new Sheep();
        Sheep clonedSheep = (Sheep) cloneFactory.getClone(sheep);
        System.out.println(sheep);
        System.out.println(sheep.hashCode());
        System.out.println("--------------------");
        System.out.println(clonedSheep);
        System.out.println(clonedSheep.hashCode());
    }
}
