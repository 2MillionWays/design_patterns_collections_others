package goncharuk.ross.Patterns.Behavioral.State;

//Context class - defines united interface for clients, contains the instance of Concrete State that defines the current state
public class TVContext {

    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void observe(){
        this.state.doAction();
    }
}
