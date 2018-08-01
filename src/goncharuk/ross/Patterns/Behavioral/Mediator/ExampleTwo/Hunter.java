package goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo;

//Concrete colleague
public class Hunter extends PartyMemberBase {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
