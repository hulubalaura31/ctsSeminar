package ro.ase.cts.gr1085.geeksForGeeks.Adapter;

public class BirdAdapter implements ToyDuck{
    Bird bird;
    public BirdAdapter(Bird bird){
        this.bird = bird;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
