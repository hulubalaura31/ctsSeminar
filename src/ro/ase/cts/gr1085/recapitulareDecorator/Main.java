package ro.ase.cts.gr1085.recapitulareDecorator;

public class Main {
    public static void main(String[] args){
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

    }
}
