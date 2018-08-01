package goncharuk.ross.Patterns.Structural.Flyweight.ExampleTwo;

public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("Drinking Healing Potion ID = " + System.identityHashCode(this));
    }
}
