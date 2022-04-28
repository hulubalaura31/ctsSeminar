package ro.ase.cts.gr1085.c2;

public class AddNumbers implements Chain{
    private  Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        if(request.getMethod() == "add"){
            System.out.print(request.getNr1() + " + " + request.getNr2() + " = "+
                    (request.getNr1()+request.getNr2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
