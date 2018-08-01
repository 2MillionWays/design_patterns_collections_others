package goncharuk.ross.Patterns.Structural.Composite;

//Leaf
public class Circle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing " + this.getClass().getSimpleName() + " of color " + color);
    }
}
