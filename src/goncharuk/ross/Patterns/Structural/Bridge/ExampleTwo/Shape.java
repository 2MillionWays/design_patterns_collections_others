package goncharuk.ross.Patterns.Structural.Bridge.ExampleTwo;

public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void applyColor();
}
