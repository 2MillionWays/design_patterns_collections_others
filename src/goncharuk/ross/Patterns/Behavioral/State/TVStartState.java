package goncharuk.ross.Patterns.Behavioral.State;

//Concrete State - implementation of specific behavior
public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV turned on");
    }
}