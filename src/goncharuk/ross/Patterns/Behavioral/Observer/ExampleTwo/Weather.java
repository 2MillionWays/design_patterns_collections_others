package goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject
//Observe Weather by implementing WeatherObserver interface and registering as listener
public class Weather {

    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather(){
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void registerObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void unregisterObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    public void changeWeather(WeatherType weatherType){
        this.currentWeather = weatherType;
        notifyObservers();
    }

    private void notifyObservers(){
        for (WeatherObserver observer : observers)
            observer.update();
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }
}
