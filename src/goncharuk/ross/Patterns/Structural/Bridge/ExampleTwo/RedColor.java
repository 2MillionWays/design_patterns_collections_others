package goncharuk.ross.Patterns.Structural.Bridge.ExampleTwo;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}
