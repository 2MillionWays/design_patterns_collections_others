package goncharuk.ross.Patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject
public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null)
            throw new NullPointerException("No Observer");
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        this.message = msg;
        System.out.println("Message posted to Topic: " + msg);
        notifyObservers();
    }
}
