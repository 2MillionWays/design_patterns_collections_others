package goncharuk.ross.Patterns.Creational.Factory.AbstractFactory;

import goncharuk.ross.Patterns.Creational.Factory.SuperClass;

public interface AbstractFactory {

    //fabric method
    SuperClass createSuperClass();
}
