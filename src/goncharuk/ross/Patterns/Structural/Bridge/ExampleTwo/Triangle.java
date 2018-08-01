package goncharuk.ross.Patterns.Structural.Bridge.ExampleTwo;

public class Triangle extends Shape {

    public Triangle(Color color){
        super(color);
        this.applyColor();
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color");
        color.applyColor();
    }
}
