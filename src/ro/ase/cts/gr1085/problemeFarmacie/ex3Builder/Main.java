package ro.ase.cts.gr1085.problemeFarmacie.ex3Builder;

public class Main {
    public static void main(String[] args){
        FacturaBuilder facturaBuilder = new FacturaBuilder();
        facturaBuilder.setNrPungi(3);
        facturaBuilder.setCotaTVA(true);
        System.out.println(facturaBuilder.factura.toString());

    }
}
