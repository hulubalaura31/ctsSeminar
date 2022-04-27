package ro.ase.cts.gr1085.lab08;

public class MasinaSuper extends Decorator{
    public MasinaSuper(InterfataMasina interfataMasina) {
        super(interfataMasina);
    }

    @Override
    public void schimbaCuloare(){
        super.schimbaCuloare();
        System.out.println(" cu picatele");
    }
}
