package ro.ase.cts.gr1085.recapitulareChainOfResponsability;

public class SubstractNumbers implements Chain{
    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getMethod() == "sub"){
            System.out.print(request.getNr1() + " - " + request.getNr2() + " = "+
                    (request.getNr1()-request.getNr2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
