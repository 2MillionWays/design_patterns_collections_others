package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility;


//Handler interface
public interface DispenseChain {

    void setNextChain(DispenseChain chain);
    void dispense(Currency currency);
}
