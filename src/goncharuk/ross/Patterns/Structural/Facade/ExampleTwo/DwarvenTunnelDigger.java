package goncharuk.ross.Patterns.Structural.Facade.ExampleTwo;

public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + "digs a tunnel");
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
