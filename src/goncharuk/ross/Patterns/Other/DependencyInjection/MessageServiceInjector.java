package goncharuk.ross.Patterns.Other.DependencyInjection;

//Injector interface
public interface MessageServiceInjector {
    Consumer getConsumer();
    Consumer getConsumerSetter();
}
