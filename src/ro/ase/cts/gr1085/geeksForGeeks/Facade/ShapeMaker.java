package ro.ase.cts.gr1085.geeksForGeeks.Facade;

public class ShapeMaker {
    private Square square;
    private Rectangle rectangle;
    private Circle circle;
    public ShapeMaker(){
        this.square = new Square();
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
