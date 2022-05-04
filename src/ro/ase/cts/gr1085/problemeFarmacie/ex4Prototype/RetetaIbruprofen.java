package ro.ase.cts.gr1085.problemeFarmacie.ex4Prototype;

public class RetetaIbruprofen extends AbsReteta{
    public RetetaIbruprofen(){
        this.continut = "contine ibruprofen";
    }
    @Override
    public void getContinut() {
        System.out.println(this.continut);
    }
}
