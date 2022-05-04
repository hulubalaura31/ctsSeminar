package ro.ase.cts.gr1085.problemeFarmacie.ex4Prototype;

public abstract class AbsReteta implements Cloneable{
    public String continut;
    public abstract void getContinut();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
