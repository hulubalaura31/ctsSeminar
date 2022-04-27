package ro.ase.cts.gr1085.lab07;

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
