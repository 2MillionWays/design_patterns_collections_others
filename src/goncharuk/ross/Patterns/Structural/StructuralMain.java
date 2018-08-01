package goncharuk.ross.Patterns.Structural;

import goncharuk.ross.Patterns.Structural.Adapter.ExampleOne.SocketAdapter;
import goncharuk.ross.Patterns.Structural.Adapter.ExampleOne.SocketAdapterClassImpl;
import goncharuk.ross.Patterns.Structural.Adapter.ExampleOne.SocketAdapterObjectImpl;
import goncharuk.ross.Patterns.Structural.Adapter.ExampleOne.Volt;
import goncharuk.ross.Patterns.Structural.Adapter.ExampleTwo.Captain;
import goncharuk.ross.Patterns.Structural.Adapter.ExampleTwo.FishingBoatAdapter;
import goncharuk.ross.Patterns.Structural.Adapter.ExampleTwo.FishingBoatAdapterClass;
import goncharuk.ross.Patterns.Structural.Bridge.ExampleTwo.RedColor;
import goncharuk.ross.Patterns.Structural.Bridge.ExampleTwo.Shape;
import goncharuk.ross.Patterns.Structural.Bridge.FlyingEnchant;
import goncharuk.ross.Patterns.Structural.Bridge.Sword;
import goncharuk.ross.Patterns.Structural.Bridge.Weapon;
import goncharuk.ross.Patterns.Structural.Composite.Circle;
import goncharuk.ross.Patterns.Structural.Composite.Drawing;
import goncharuk.ross.Patterns.Structural.Composite.Triangle;
import goncharuk.ross.Patterns.Structural.Decorator.BasicCar;
import goncharuk.ross.Patterns.Structural.Decorator.Car;
import goncharuk.ross.Patterns.Structural.Decorator.ExampleTwo.ClubbedTroll;
import goncharuk.ross.Patterns.Structural.Decorator.ExampleTwo.SimpleTroll;
import goncharuk.ross.Patterns.Structural.Decorator.ExampleTwo.Troll;
import goncharuk.ross.Patterns.Structural.Decorator.LuxuryCar;
import goncharuk.ross.Patterns.Structural.Decorator.SportsCar;
import goncharuk.ross.Patterns.Structural.Facade.ExampleTwo.DwarvenGoldmineFacade;
import goncharuk.ross.Patterns.Structural.Facade.HelperFacade;
import goncharuk.ross.Patterns.Structural.Flyweight.ExampleTwo.PotionFactory;
import goncharuk.ross.Patterns.Structural.Proxy.IvoryTower;
import goncharuk.ross.Patterns.Structural.Proxy.Wizard;
import goncharuk.ross.Patterns.Structural.Proxy.WizardTower;
import goncharuk.ross.Patterns.Structural.Proxy.WizardTowerProxy;

public class StructuralMain {
    public static void main(String[] args) {

        //Adapter - Socket returning necessary Volts - ex - java.util.Arrays#asList()
        SocketAdapter socketAdapter = new SocketAdapterClassImpl();
        SocketAdapter socketAdapter1 = new SocketAdapterObjectImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v220 = socketAdapter1.get220Volt();
        System.out.println("***********");
        //Adapt a class to necessary interface - adding a specific adapter-class (is-a or has-a targeted class) to interface
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
        Captain captain1 = new Captain(new FishingBoatAdapterClass());
        captain1.row();
        System.out.println("------------------------------------- Composite");

        //Composite - creating a group of objects with the same behavior as single instance of contained Object
        Triangle triangle = new Triangle();
        triangle.draw("Red");
        Circle circle = new Circle();
        circle.draw("Dark");
        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Blue");
        System.out.println("------------------------------------- Proxy");

        //Proxy - wrapper around targeted class - to provide additional logic, control or functionality
        WizardTower wizardTower = new WizardTowerProxy(new IvoryTower());
        wizardTower.enter(new Wizard("Ross"));
        wizardTower.enter(new Wizard("Bob"));
        wizardTower.enter(new Wizard("Valera"));
        System.out.println("------------------------------------- Flyweight");

        //Flyweight - using map to create cache of objects - huge amounts of costly objects
        PotionFactory factory = new PotionFactory();
        //This example - objects got no extrinsic properties, therefore we use only the objects with intrinsic prop.
        factory.createPotion(PotionFactory.PotionType.HEALING).drink();
        factory.createPotion(PotionFactory.PotionType.HEALING).drink();
        factory.createPotion(PotionFactory.PotionType.INVISIBILITY).drink();
        factory.createPotion(PotionFactory.PotionType.INVISIBILITY).drink();
        System.out.println("------------------------------------- Facade");

        //Facade - creating a unified and/or simplified interface (class) for set of interfaces
        HelperFacade.generateReport(HelperFacade.DBType.MYSQL,HelperFacade.ReportType.HTML,"Employee");
        HelperFacade.generateReport(HelperFacade.DBType.ORACLE,HelperFacade.ReportType.PDF,"Test");
        System.out.println("***********");
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.gidOutGold();
        facade.goHome();
        System.out.println("------------------------------------- Bridge");

        //Bridge - decouple abstraction from its implementation so that two can vary independently
        //preferring composition over inheritance. Pushing implementation from hierarchy to another object of another hierarchy
        Weapon aliBabaSword = new Sword(new FlyingEnchant());
        aliBabaSword.wield();
        aliBabaSword.swing();
        aliBabaSword.unwield();
        System.out.println("***********");
        Shape bridgeColor = new goncharuk.ross.Patterns.Structural.Bridge.ExampleTwo.Triangle(new RedColor());
        bridgeColor.applyColor();
        System.out.println("------------------------------------- Decorator");

        //Decorator - attach additional responsibilities to object dynamically.
        //a.k.a. - WRAPPER - dynamic change of behavior by wrapping object in decorator object
        Car car = new BasicCar();
        car.assemble();
        car = new SportsCar(new LuxuryCar(car));
        car.assemble();
        car = new LuxuryCar(new SportsCar(new BasicCar()));
        car.assemble();
        System.out.println("***********");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll = new ClubbedTroll(troll);
        troll.attack();
    }
}
