package goncharuk.ross.Patterns.Structural.Decorator.ExampleTwo;

//specific (child) decorator - used without Parent/Base Decorator
public class ClubbedTroll implements Troll {

    public Troll troll;

    public ClubbedTroll(Troll troll){
        this.troll = troll;
    }

    @Override
    public void attack() {
        troll.attack();
        System.out.println("Attack with a Club!");
    }
}
