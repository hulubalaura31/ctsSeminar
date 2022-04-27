package ro.ase.cts.gr1085.lab07;

import java.util.ArrayList;
import java.util.List;

public class Livada {
    List<Copac> copaci;

    public Livada(){
        copaci= new ArrayList<>();
    }

    public void planteazaCopac(Copac copac){
        copaci.add(copac);
    }
}
