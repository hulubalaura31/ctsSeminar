package ro.ase.cts.gr1085.recapitulareChainOfResponsability;

public class DivideNumbers implements Chain{
    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getMethod() == "div"){
            System.out.print(request.getNr1() + " / " + request.getNr2() + " = "+
                    (request.getNr1()/request.getNr2()));
        } else {
            System.out.print("Only works for add, sub, mult, and div");
        }
    }
}
