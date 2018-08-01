package goncharuk.ross.Patterns.Structural.Decorator;

//Component implementation - basic implementation of component interface
public class BasicCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
