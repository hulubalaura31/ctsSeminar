package ro.ase.cts.gr1085.recapitularePrototype;

public class Sheep implements Animal{
    public Sheep(){
        System.out.println("Sheep");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep from clone");
        Sheep sheep =null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{}";
    }
}
