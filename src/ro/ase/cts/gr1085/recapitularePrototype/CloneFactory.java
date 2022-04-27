package ro.ase.cts.gr1085.recapitularePrototype;

public class CloneFactory {
    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
