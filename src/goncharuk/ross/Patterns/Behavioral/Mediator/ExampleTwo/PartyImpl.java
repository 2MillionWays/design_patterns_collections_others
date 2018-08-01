package goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo;

import java.util.ArrayList;
import java.util.List;

//Concrete Mediator
public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl(){
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember partyMember) {
        members.add(partyMember);
        partyMember.joinParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember partyMember : members){
            if ((!partyMember.equals(actor)))
                partyMember.partyAction(action);
        }
    }

    @Override
    public void removeMember(PartyMember partyMember) {
        members.remove(partyMember);
        partyMember.leaveParty(this);
    }
}
