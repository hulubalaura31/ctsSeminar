package ro.ase.cts.gr1085.geeksForGeeks.Singleton;

public class SingletonLazyInitialization {
    private String name;
    private static SingletonLazyInitialization instance;
    private SingletonLazyInitialization(){ this.name = "test3";}
    public static SingletonLazyInitialization getInstance(){
        if(instance == null){
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}
