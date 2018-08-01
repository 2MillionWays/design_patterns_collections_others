package goncharuk.ross.Patterns.Behavioral.Mediator;

//Mediator Interface
public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);

    void addUsers(User...users);
}
