package ro.ase.cts.gr1085.geeksForGeeks.Decorator;

public class Paneer extends ToppingDecorator{
    private Pizza pizza;
    public Paneer(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Paneer";
    }
}
