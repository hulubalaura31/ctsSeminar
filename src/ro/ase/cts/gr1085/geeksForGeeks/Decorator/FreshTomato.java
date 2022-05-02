package ro.ase.cts.gr1085.geeksForGeeks.Decorator;

public class FreshTomato extends ToppingDecorator{
    private Pizza pizza;
    public FreshTomato(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", FreshTomato";
    }
}
