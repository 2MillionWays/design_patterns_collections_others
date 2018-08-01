package goncharuk.ross.Patterns.Behavioral.Mediator;

//Concrete Colleague
public class RegularUser extends User {

    public RegularUser(ChatMediator mediator, String name){
        super(mediator,name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name + " sends message: " + msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }
}
