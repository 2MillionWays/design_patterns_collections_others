package goncharuk.ross.Patterns.Other.DependencyInjection;

//Injector class - initialize the service and then the consumer class
public class SMSServiceInjector implements MessageServiceInjector {

    //Constructor Injection processing
    @Override
    public Consumer getConsumer() {
        return new App(new SMSServiceImpl());
    }

    //Setter Injection processing
    @Override
    public Consumer getConsumerSetter() {
        App app = new App();
        app.setService(new SMSServiceImpl());
        return app;
    }
}
