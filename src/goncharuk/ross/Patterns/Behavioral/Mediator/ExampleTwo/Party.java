package goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo;

//Mediator interface
public interface Party {

    void addMember(PartyMember partyMember);
    void act(PartyMember actor, Action action);
    void removeMember(PartyMember partyMember);
}
