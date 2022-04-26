package ro.ase.cts.gr1085.tema1;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private static Map<String, Masina> lista;

    public MasinaFactory(){
        lista = new HashMap<String, Masina>();
    }

    public static InterfataMasina getMasina(String culoare){
        if (lista.containsKey(culoare))
            return lista.get(culoare);
        else
        {
            InterfataMasina masina = new Masina(culoare);
            lista.put(culoare, (Masina)masina);
            return masina;
        }
    }
}
