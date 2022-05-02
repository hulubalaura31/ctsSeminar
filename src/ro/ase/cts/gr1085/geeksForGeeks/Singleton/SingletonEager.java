package ro.ase.cts.gr1085.geeksForGeeks.Singleton;

public class SingletonEager {
    private String name ;
    private static final SingletonEager instance = new SingletonEager();
    private SingletonEager(){this.name = "test1";};
    public static SingletonEager getInstance(){
        return instance;
    }
}
