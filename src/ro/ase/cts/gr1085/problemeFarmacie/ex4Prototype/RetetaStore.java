package ro.ase.cts.gr1085.problemeFarmacie.ex4Prototype;

import java.util.HashMap;
import java.util.Map;

public class RetetaStore {
    public static Map<String, AbsReteta> reteta = new HashMap<>();
    static {
        reteta.put("nurofen", new RetetaNurofen());
        reteta.put("ibruprofen", new RetetaIbruprofen());
    }

     public static AbsReteta getReteta(String continut) throws CloneNotSupportedException {
        if(continut == null){
            throw new UnsupportedOperationException();
        }else{
            return (AbsReteta) reteta.get(continut).clone();
        }
    }
}
