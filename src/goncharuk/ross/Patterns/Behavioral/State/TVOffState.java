package goncharuk.ross.Patterns.Behavioral.State;

//Concrete State - implementation of specific behavior
public class TVOffState implements State {
    @Override
    public void doAction() {
        System.out.println("TV turned off");
    }
}