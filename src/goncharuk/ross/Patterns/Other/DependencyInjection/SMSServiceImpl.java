package goncharuk.ross.Patterns.Other.DependencyInjection;

//Service component
public class SMSServiceImpl implements MessagingService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Sending sms to " + rec + ": " + msg);
    }
}
