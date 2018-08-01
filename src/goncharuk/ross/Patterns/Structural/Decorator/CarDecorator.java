package goncharuk.ross.Patterns.Structural.Decorator;

//Decorator - class that implements component interface and also has a HAS-A relation with it.
//Component interface variable should be accessible to child decorators
public class CarDecorator extends Car {

    private Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
