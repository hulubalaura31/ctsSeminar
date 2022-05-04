package ro.ase.cts.gr1085.problemeFarmacie.ex4Prototype;

public class RetetaNurofen extends AbsReteta{
    public RetetaNurofen(){
        this.continut = "contine nurofen";
    }
    @Override
    public void getContinut() {
        System.out.println(this.continut);
    }
}
