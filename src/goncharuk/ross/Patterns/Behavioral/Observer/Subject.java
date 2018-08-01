package goncharuk.ross.Patterns.Behavioral.Observer;

//Subject interface - defines the contract methods to be implemented by Concrete Subjects
public interface Subject {

    //methods to register and unregister observers
    void register(Observer observer);
    void unregister(Observer observer);

    //method to notify observers of any change
    void notifyObservers();

    //method to get updates from subjects
    Object getUpdate(Observer observer);
}
