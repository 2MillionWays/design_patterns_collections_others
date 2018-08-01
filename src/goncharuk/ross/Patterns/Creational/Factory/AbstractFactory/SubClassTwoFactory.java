package goncharuk.ross.Patterns.Creational.Factory.AbstractFactory;

import goncharuk.ross.Patterns.Creational.Factory.SubClassTwo;
import goncharuk.ross.Patterns.Creational.Factory.SuperClass;

//Factory for SubClassTwo
public class SubClassTwoFactory implements AbstractFactory {

    private String ram;
    private String cpu;
    private String hdd;

    public SubClassTwoFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    //Fabric method implementation
    @Override
    public SuperClass createSuperClass() {
        return new SubClassTwo(ram,cpu,hdd);
    }
}
