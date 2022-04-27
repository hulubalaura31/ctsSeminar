package ro.ase.cts.gr1085.lab08;

public class Decorator implements InterfataMasina{
    InterfataMasina interfataMasina;

    public Decorator(InterfataMasina interfataMasina){
        this.interfataMasina = interfataMasina;
    }

    @Override
    public void schimbaCuloare() {
        interfataMasina.schimbaCuloare();
    }
}
