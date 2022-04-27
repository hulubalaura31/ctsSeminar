package ro.ase.cts.gr1085.recapitulareDecorator;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Sauce");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", tomato sauce";
    }

    public double getCost(){
        System.out.println("Cost of Sauce: " + .35);
        return tempPizza.getCost() + .35;
    }
}
