package ro.ase.cts.gr1085.geeksForGeeks.AbstractFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
