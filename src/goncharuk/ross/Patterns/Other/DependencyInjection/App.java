package goncharuk.ross.Patterns.Other.DependencyInjection;

//Consumer class - uses service interface
public class App implements Consumer {

    private MessagingService service;

    public App() {
    }

    //Setter Injection
    public void setService(MessagingService service) {
        this.service = service;
    }

    //Constructor Injection
    public App(MessagingService service) {
        this.service = service;
    }

    @Override
    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg,rec);
    }
}
