package goncharuk.ross.Patterns.Other.DependencyInjection;

//Service interface
public interface MessagingService {

    void sendMessage(String msg, String rec);
}
