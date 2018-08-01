package goncharuk.ross.Patterns.Creational.Factory.AbstractFactory;

import goncharuk.ross.Patterns.Creational.Factory.SuperClass;

//consumer class that provides an entry point for client classes
public class SuperClassFactory {

    //Factory method
    public static SuperClass getComputer(AbstractFactory abstractFactory){
        return abstractFactory.createSuperClass();
    }
}