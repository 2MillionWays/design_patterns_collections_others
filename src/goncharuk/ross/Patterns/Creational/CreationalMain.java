package goncharuk.ross.Patterns.Creational;

import goncharuk.ross.Patterns.Creational.Builder.Computer;
import goncharuk.ross.Patterns.Creational.Factory.AbstractFactory.SubClassOneFactory;
import goncharuk.ross.Patterns.Creational.Factory.AbstractFactory.SubClassTwoFactory;
import goncharuk.ross.Patterns.Creational.Factory.AbstractFactory.SuperClassFactory;
import goncharuk.ross.Patterns.Creational.Factory.FactoryClass;
import goncharuk.ross.Patterns.Creational.Factory.SuperClass;
import goncharuk.ross.Patterns.Creational.Factory.SuperClassInterface;
import goncharuk.ross.Patterns.Creational.Prototype.Employees;

public class CreationalMain {
    public static void main(String[] args) {
        System.out.println("------------------------------------- Singleton");
        //Singleton - ensure that class has only one instance and provide a global point of access to it
        Singleton singleton = Singleton.getInstance();
        singleton.setName("Ross");
        System.out.println(singleton.getName());
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println("------------------------------------- Factory");

        //Factory - hide project creation. Create necessary object depending on input parameter
        //singleton factory
        FactoryClass factoryClass = FactoryClass.getInstance();
        SuperClassInterface one = factoryClass.getSuperClass("SubOne","1000","10","1.6");
        SuperClassInterface two = factoryClass.getSuperClass("SubTwo", "2000", "20", "3.0");
        System.out.println(one);
        System.out.println(two);
        //static method factory
        SuperClassInterface three = FactoryClass.getSuperClassStatic("SubTwo", "3000", "80", "2x2.6");
        System.out.println(three);
        System.out.println("------------------------------------- Abstract Factory");

        //Abstract Factory - hide creation, avoid conditions in factory method. Create object based on input object-factory
        //Factory method implemented by each specific factory to return target object
        SuperClass first = SuperClassFactory.getComputer(new SubClassOneFactory("1000", "2.2","20"));
        SuperClass second = SuperClassFactory.getComputer(new SubClassTwoFactory("2000","3.2","60"));
        System.out.printf(first + "%n" + second + "%n");
        System.out.println("------------------------------------- Builder");

        //Builder - separate complex object construction from its representation
        //so that the same construction process could create different representations
        Computer oldComp = new Computer.ComputerBuilder("1024","2.4","80")
                .setIsOld(true)
                .build();
        Computer newComp = new Computer.ComputerBuilder("8096","4x2.6","800")
                .build();
        System.out.println(oldComp);
        System.out.println(newComp);
        System.out.println("------------------------------------- Prototype");

        //Prototype - create object based on existing object through cloning;
        Employees employees = new Employees();
        employees.loadData();
        System.out.println(employees);
        //copy/clone existing object instead of creating a new one
        Employees prototypeOne = employees.clone();
        prototypeOne.getList().add("Oksana");
        Employees prototypeTwo = employees.clone();
        prototypeTwo.getList().remove("Ross");
        System.out.println(prototypeOne);
        System.out.println(prototypeTwo);
    }
}
