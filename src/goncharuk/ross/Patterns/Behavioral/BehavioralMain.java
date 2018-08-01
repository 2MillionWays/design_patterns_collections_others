package goncharuk.ross.Patterns.Behavioral;

import goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.*;
import goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.Currency;
import goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.ExampleTwo.OrcKing;
import goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.ExampleTwo.Request;
import goncharuk.ross.Patterns.Behavioral.Command.*;
import goncharuk.ross.Patterns.Behavioral.Command.ExampleThree.Goblin;
import goncharuk.ross.Patterns.Behavioral.Command.ExampleThree.SizeSpell;
import goncharuk.ross.Patterns.Behavioral.Command.ExampleThree.Target;
import goncharuk.ross.Patterns.Behavioral.Command.ExampleThree.VisibilitySpell;
import goncharuk.ross.Patterns.Behavioral.Command.ExampleTwo.*;
import goncharuk.ross.Patterns.Behavioral.Interpreter.ExampleTwo.*;
import goncharuk.ross.Patterns.Behavioral.Interpreter.Expression;
import goncharuk.ross.Patterns.Behavioral.Interpreter.IntToBinaryExpression;
import goncharuk.ross.Patterns.Behavioral.Interpreter.IntToHexExpression;
import goncharuk.ross.Patterns.Behavioral.Interpreter.InterpreterContext;
import goncharuk.ross.Patterns.Behavioral.Iterator.*;
import goncharuk.ross.Patterns.Behavioral.Iterator.ExampleTwo.ContainerImpl;
import goncharuk.ross.Patterns.Behavioral.Mediator.ChatMediator;
import goncharuk.ross.Patterns.Behavioral.Mediator.ChatMediatorImpl;
import goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo.*;
import goncharuk.ross.Patterns.Behavioral.Mediator.RegularUser;
import goncharuk.ross.Patterns.Behavioral.Mediator.User;
import goncharuk.ross.Patterns.Behavioral.Memento.FileWriterCareTaker;
import goncharuk.ross.Patterns.Behavioral.Memento.FileWriterUtil;
import goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo.Orc;
import goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo.Weather;
import goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo.WeatherObserver;
import goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo.WeatherType;
import goncharuk.ross.Patterns.Behavioral.Observer.MyTopic;
import goncharuk.ross.Patterns.Behavioral.Observer.MyTopicSubscriber;
import goncharuk.ross.Patterns.Behavioral.Observer.Observer;
import goncharuk.ross.Patterns.Behavioral.State.TVContext;
import goncharuk.ross.Patterns.Behavioral.State.TVOffState;
import goncharuk.ross.Patterns.Behavioral.State.TVStartState;
import goncharuk.ross.Patterns.Behavioral.Strategy.CreditCardStrategy;
import goncharuk.ross.Patterns.Behavioral.Strategy.Item;
import goncharuk.ross.Patterns.Behavioral.Strategy.PayPalStrategy;
import goncharuk.ross.Patterns.Behavioral.Strategy.ShoppingCart;
import goncharuk.ross.Patterns.Behavioral.TemplateMethod.GlassHouse;
import goncharuk.ross.Patterns.Behavioral.TemplateMethod.HouseTemplate;
import goncharuk.ross.Patterns.Behavioral.TemplateMethod.WoodenHouse;
import goncharuk.ross.Patterns.Behavioral.Visitor.*;
import goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo.Captain;
import goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo.CaptainVisitor;
import goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo.Soldier;
import goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo.SoldierVisitor;

public class BehavioralMain {
    public static void main(String[] args) {
        System.out.println("------------------------------------- Template method");
        //Template method - define a fixed algorithm with some pre-defined logic
        // and some steps to be defined by specific sub-classes
        HouseTemplate house = new WoodenHouse();
        house.buildHouse();
        house = new GlassHouse();
        System.out.println("*********");
        house.buildHouse();
        System.out.println("------------------------------------- Mediator");

        //Mediator - an object that encapsulates how a set of objects interact
        //providing centralized communication medium between different objects in the system
        ChatMediator mediator = new ChatMediatorImpl();
        User ross = new RegularUser(mediator,"Ross");
        User bob = new RegularUser(mediator,"Bob");
        User sam = new RegularUser(mediator,"Sam");
        //add Clients to mediator
        mediator.addUsers(ross,bob,sam);
        ross.sendMessage("Ololo!");
        System.out.println("***********");
        //create mediator
        Party party = new PartyImpl();
        //create clients
        PartyMember member = new Wizard();
        PartyMember member1 = new Hobbit();
        //add Clients to mediator
        party.addMember(member);
        party.addMember(member1);
        member.act(Action.HUNT);
        member1.act(Action.GOLD);
        member.leaveParty(party);
        System.out.println("------------------------------------- Observer");

        //Observer - define one-to-many dependency between objects so that when one object changes state
        // all dependents are notified and updated automatically. Notification system for any changes.
        //create subject
        MyTopic topic = new MyTopic();
        //create observers
        Observer observer = new MyTopicSubscriber("Ross");
        Observer observer1 = new MyTopicSubscriber("Tom");
        //register observers to the subject
        topic.register(observer);
        topic.register(observer1);
        //attach subject to observers
        observer.setSubject(topic);
        observer1.setSubject(topic);
        //check for updates
        observer.update();
        //post message to subject
        topic.postMessage("Test!");
        System.out.println("*************");
        //Subject
        Weather weather = new Weather();
        //create observers and set subjects in constructors
        WeatherObserver hobbit = new goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo.Hobbit(weather);
        WeatherObserver orc = new Orc(weather);
        weather.registerObserver(hobbit);
        weather.registerObserver(orc);
        weather.changeWeather(WeatherType.RAINY);
        System.out.println("------------------------------------- Chain Of Responsibility");

        //Chain Of Responsibility - give more than one object a chance to handle the request
        // to avoid coupling the sender and its receiver. Chain receiving objects and pass the request till it's handled
        DispenseChain first = new Dollar50Dispenser();
        DispenseChain second = new Dollar20Dispenser();
        DispenseChain third = new Dollar10Dispenser();
        first.setNextChain(second);
        second.setNextChain(third);
        Currency currency = new Currency(1031);
        first.dispense(currency);
        System.out.println("***************");
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(Request.RequestType.DEFEND_CASTLE));
        king.makeRequest(new Request(Request.RequestType.TORTURE_PRISONER));
        king.makeRequest(new Request(Request.RequestType.COLLECT_TAX));
        System.out.println("------------------------------------- Strategy");

        //Strategy - define a family of algorithms, encapsulate each one and make them interchangeable
        //Lets algorithms vary independently from clients that use it.
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1412314",30));
        cart.addItem(new Item("542321", 4000));
        //Method Dep Injection - Concrete strategy passed to Context's method - result varies on passed Strategy!
        cart.pay(new CreditCardStrategy("Ross",3212,312,"02/12"));
        cart.pay(new PayPalStrategy("231231@gmail.com"));
        //constructor with Strategy object - Context(Strategy)
        cart = new ShoppingCart(new PayPalStrategy("63432@gmail.com"));
        cart.addItem(new Item("87553",399));
        cart.pay();
        System.out.println("------------------------------------- State");

        //State - allow object to change its behavior when its internal state changes
        TVContext context = new TVContext();
        context.setState(new TVStartState());
        context.observe();
        context.setState(new TVOffState());
        context.observe();
        System.out.println("------------------------------------- Command");

        //Command - encapsulate a request as an object to let parametrize clients with different requests,
        // queue or log requests and support undoable operations - callbacks!
        //Example 1 - looks like bridge though...
        FileSystemReceiver receiver = new WindowsFileSystemReceiver();
        Command command = new OpenFileCommand(receiver);
        FileInvoker invoker = new FileInvoker(command);
        invoker.execute();
        receiver = new UnixFileSystemReceiver();
        command = new CloseFileCommand(receiver);
        invoker.setCommand(command);
        invoker.execute();
        WindowsFileSystemReceiver receiver1 = new WindowsFileSystemReceiver();
        FileInvoker invoker1 = new FileInvoker();
        invoker1.setCommand(receiver1::closeFile);
        System.out.println("***************");
        //Example two
        Stock stock = new Stock();
        Order buy = new BuyStock(stock);
        Order sell = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buy);
        broker.takeOrder(sell);
        broker.executeOrders();
        System.out.println("***************");
        //Example three
        Target target = new Goblin();
        goncharuk.ross.Patterns.Behavioral.Command.ExampleThree.Wizard wizard = new goncharuk.ross.Patterns.Behavioral.Command.ExampleThree.Wizard();
        target.printStatus();
        //Invoke command
        wizard.castSpell(new SizeSpell(),target);
        target.printStatus();
        wizard.castSpell(new VisibilitySpell(),target);
        target.printStatus();
        //Invoke undo and redo
        wizard.undoLastSpell();
        target.printStatus();
        wizard.redoLastSpell();
        System.out.println("------------------------------------- Visitor");

        //Visitor - represent an operation to be performed on the elements of an object structure
        //Move operation logic to another class, without changing the classes of elements on which it operates
        CompositeElement element = new CompositeElement();
        element.addElements(new Book(100, "62341"));
        element.addElements(new Fruit(20,2,"Banana"));
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int total = element.accept(visitor);
        System.out.println(total);
        System.out.println("***************");
        Captain captain = new Captain(new Soldier(),new Soldier());
        captain.accept(new SoldierVisitor());
        captain.accept(new CaptainVisitor());
        System.out.println("------------------------------------- Interpreter");

        //Interpreter - as in language - define representation along with interpreter that uses representation
        //to interpret sentences in a language. Example - java compiler - java code -> byte code
        int value = 28;
        InterpreterContext context1 = new InterpreterContext();
        Expression ex1 = new IntToBinaryExpression(value);
        System.out.println(value + " in Binary" + " = " + ex1.interpret(context1));
        ex1 = new IntToHexExpression(value);
        System.out.println(value + " in Hexadecimal" + " = " + ex1.interpret(context1));
        System.out.println("***************");
        ExpressionExTwo robert = new TerminalExpression("Robert");
        ExpressionExTwo john = new TerminalExpression("John");
        OrExpression orExpression = new OrExpression(robert,john);
        AndExpression andExpression = new AndExpression(robert,john);
        System.out.println(orExpression.interpret(new Context("Robert")));
        System.out.println(andExpression.interpret(new Context("Robert John")));
        System.out.println("------------------------------------- Iterator");

        //Iterator - provide a way to access the elements of an aggregate object sequentially without exposing
        // its underlying representation.
        ChannelCollection collection = new ChannelCollectionImpl();
        collection.addChannel(new Channel(20.12,ChannelType.ENGLISH));
        collection.addChannel(new Channel(111.02,ChannelType.UKRAINIAN));
        ChannelIterator iterator = collection.iterator(ChannelType.UKRAINIAN);
        while (iterator.hasNext()){
            Channel channel = (Channel) iterator.next();
            System.out.println(channel);
        }
        System.out.println("***************");
        ContainerImpl<String> container = new ContainerImpl<>();
        container.add("Ross","Valera","Ivan","Vasya");
        goncharuk.ross.Patterns.Behavioral.Iterator.ExampleTwo.Iterator iterator1 = container.iterator();
        for (;iterator1.hasNext();){
            System.out.println(iterator1.next());
        }
        System.out.println("------------------------------------- Memento");

        //Memento - w/o violating encapsulation, capture and externalize an object's internal state
        //so that the object can be restored to this state later
        FileWriterCareTaker careTaker = new FileWriterCareTaker();
        FileWriterUtil writer = new FileWriterUtil("data.txt");
        writer.write("First Line \n");
        System.out.println(writer);
        //save current state
        careTaker.save(writer);
        writer.write("Second Line\n");
        writer.write("Thrird Line\n");
        System.out.println(writer);
        //undo not saved changes
        careTaker.undo(writer);
        System.out.println(writer);
    }
}
