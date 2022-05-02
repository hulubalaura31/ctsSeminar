package ro.ase.cts.gr1085.geeksForGeeks.Singleton;

public class SingletonThreadSafe {
    private String name;
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe(){ this.name = "test4";}
    synchronized public static SingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
