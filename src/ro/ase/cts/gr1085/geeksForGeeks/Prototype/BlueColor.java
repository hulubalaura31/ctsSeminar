package ro.ase.cts.gr1085.geeksForGeeks.Prototype;

public class BlueColor extends Color{
    public BlueColor(){
        this.colorName = "blue";
    }
    @Override
    void addColor() {
        System.out.println("Blue color added");
    }
}
