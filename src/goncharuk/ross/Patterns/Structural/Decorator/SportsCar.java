package goncharuk.ross.Patterns.Structural.Decorator;

//Child decorator - extends basic decorator and adds specific functionality
public class SportsCar extends CarDecorator {

    public SportsCar(Car car){
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}
