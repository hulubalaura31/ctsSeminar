package ro.ase.cts.gr1085.problemeFarmacie.ex5Adapter;

public class Main {
    public static void main(String[] args){
        SoftwareNou softwareNou = new SoftwareNou();
        AplicatieDeVanzare aplicatieDeVanzare = new AplicatieDeVanzare();
        AplicatieDeVanzareAdapter aplicatieDeVanzareAdapter = new AplicatieDeVanzareAdapter(aplicatieDeVanzare);
        System.out.println(aplicatieDeVanzareAdapter.verificaStocPentruMedicament("a",20));
    }
}
