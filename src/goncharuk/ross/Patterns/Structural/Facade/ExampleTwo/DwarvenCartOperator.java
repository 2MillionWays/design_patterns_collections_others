package goncharuk.ross.Patterns.Structural.Facade.ExampleTwo;

public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + " transports cards with gold");
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
