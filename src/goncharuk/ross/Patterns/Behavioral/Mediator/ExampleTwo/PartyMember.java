package goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo;

//Colleague interface
public interface PartyMember {

    void joinParty(Party party);
    void partyAction(Action action);
    void act(Action action);
    void leaveParty(Party party);
}
