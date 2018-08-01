package goncharuk.ross.Patterns.Behavioral.Strategy;

//Strategy interface
@FunctionalInterface
//Functional Interface - interface with only one abstract method
public interface PaymentStrategy {

    void pay(int amount);
}
