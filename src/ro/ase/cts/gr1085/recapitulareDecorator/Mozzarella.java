package ro.ase.cts.gr1085.recapitulareDecorator;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", mozzarella";
    }

    public double getCost(){
        System.out.println("Cost of Moz: " + .50);
        return tempPizza.getCost() + .50;
    }
}
