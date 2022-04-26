package ro.ase.cts.gr1085.tema1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        MasinaFactory factory = new MasinaFactory();

        InterfataMasina galbena = factory.getMasina("galben"); galbena.setNumarulRoti(3);
        InterfataMasina rosie = factory.getMasina("portocaliu"); rosie.setNumarulRoti(4);
        InterfataMasina galbena2 = factory.getMasina("galben"); galbena2.setNumarulRoti(8);

        galbena.afiseaza(); // also shows 30 because we modified the original object
        rosie.afiseaza();
        galbena2.afiseaza();

    }
}