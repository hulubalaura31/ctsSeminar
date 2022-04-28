package ro.ase.cts.gr1085.c2;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);
}
