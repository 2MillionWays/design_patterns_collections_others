package goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo;

//Concrete Colleague
public class Hobbit extends PartyMemberBase {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
