package ro.ase.cts.gr1085.c2;

public class Numbers {
    private int nr1;
    private int nr2;
    private String method;
    public Numbers(int nr1, int nr2, String method){
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.method = method;
    }

    public int getNr1() {
        return nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public String getMethod() {
        return method;
    }
}
