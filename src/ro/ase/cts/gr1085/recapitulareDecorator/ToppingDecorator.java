package ro.ase.cts.gr1085.recapitulareDecorator;

public class ToppingDecorator implements Pizza{
    protected Pizza tempPizza;
    public ToppingDecorator(Pizza pizza){
        this.tempPizza = pizza;
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
