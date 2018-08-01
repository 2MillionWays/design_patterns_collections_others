package goncharuk.ross.Patterns.Structural.Flyweight.ExampleTwo;

public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("Drinking Invisibility Potion ID = " + System.identityHashCode(this));
    }
}
