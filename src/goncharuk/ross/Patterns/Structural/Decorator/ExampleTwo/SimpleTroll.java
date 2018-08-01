package goncharuk.ross.Patterns.Structural.Decorator.ExampleTwo;

//Component implementation
public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        System.out.println("Single attack");
    }
}
