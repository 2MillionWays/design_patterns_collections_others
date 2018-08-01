package goncharuk.ross.Patterns.Creational.Factory.AbstractFactory;

import goncharuk.ross.Patterns.Creational.Factory.SubClassOne;
import goncharuk.ross.Patterns.Creational.Factory.SuperClass;

//Factory for SubClassOne
public class SubClassOneFactory implements AbstractFactory {

    private String ram;
    private String cpu;
    private String hdd;

    public SubClassOneFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    //fabric method implementation
    @Override
    public SuperClass createSuperClass() {
        return new SubClassOne(ram,cpu,hdd);
    }
}
