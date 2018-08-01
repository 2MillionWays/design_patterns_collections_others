package goncharuk.ross.Patterns.Other.DependencyInjection;

//Service component
public class EmailServiceImpl implements MessagingService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Send email to " + rec + ": " + msg);
    }
}
