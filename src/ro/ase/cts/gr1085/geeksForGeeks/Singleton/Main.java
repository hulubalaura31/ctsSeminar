package ro.ase.cts.gr1085.geeksForGeeks.Singleton;

public class Main {
    public static void main(String[] args){
        try {
            SingletonEager singletonEager = SingletonEager.getInstance();
            System.out.println(singletonEager);
            System.out.println("-------------------");
            SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization.getInstance();
            System.out.println(singletonLazyInitialization);
            System.out.println("-------------------");
           SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
            System.out.println(singletonThreadSafe);
            System.out.println("-------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
