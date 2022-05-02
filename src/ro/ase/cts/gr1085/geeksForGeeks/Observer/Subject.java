package ro.ase.cts.gr1085.geeksForGeeks.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}
