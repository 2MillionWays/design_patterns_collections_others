package goncharuk.ross.Patterns.Structural.Facade.ExampleTwo;

public class DwarvenGoldDigger extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + "digs for gold");
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
