package ro.ase.cts.gr1085.geeksForGeeks.Singleton;

public class SingletonStatic {
    private String name;
    private static  SingletonStatic instance;
    private SingletonStatic(){
        this.name="test2";
    }
    static{
        instance = new SingletonStatic();
    }
}
