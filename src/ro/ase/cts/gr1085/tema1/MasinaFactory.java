package ro.ase.cts.gr1085.tema1;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private static Map<Integer, Masina> lista;

    public MasinaFactory(){
        lista = new HashMap<Integer, Masina>();
    }

    public static InterfataMasina getMasina(int viteza){
        if(!lista.isEmpty()){
            if(lista.containsKey(viteza)){
                return lista.get(viteza);
            }else{
                InterfataMasina interfataMasina = new Masina(viteza);
                lista.put(viteza, (Masina) interfataMasina);
                return interfataMasina;
            }
        }
        return null;
    }
}
