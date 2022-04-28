package ro.ase.cts.gr1085.c2;

public class Main {
    public static void main(String[] args){

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubstractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4,2,"add");
        chainCalc1.calculate(request);
    }
}
