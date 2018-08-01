package goncharuk.ross.Patterns.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

//Concrete mediator
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users){
            if (u != user)
                u.receiveMessage(msg);
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void addUsers(User... users) {
        for (User u : users)
            addUser(u);
    }
}
