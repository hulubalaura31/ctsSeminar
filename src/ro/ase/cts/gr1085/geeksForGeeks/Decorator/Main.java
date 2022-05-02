package ro.ase.cts.gr1085.geeksForGeeks.Decorator;

public class Main {
    public static void main(String args[])
    {
        Pizza pizza = new PeppyPaneer();
        System.out.println( pizza.getDescription() +
                " Cost :" + pizza.getCost());

        Pizza pizza2 = new FarmHouse();

        pizza2 = new FreshTomato(pizza2);

        pizza2 = new Paneer(pizza2);

        System.out.println( pizza2.getDescription() +
                " Cost :" + pizza2.getCost());

    }
}
