package goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo;

//ConcreteObserver
public class Hobbit implements WeatherObserver {

    private Weather weather;
    private String state;

    public Hobbit(){}

    public Hobbit(Weather weather){
        this.weather = weather;
    }

    @Override
    public void update() {
        switch (weather.getCurrentWeather()){
            case RAINY:
                System.out.println("Looking for a cover");
            break;
            case SUNNY:
                System.out.println("Walking around");
            break;
            case WINDY:
                System.out.println("Leaning low");
            break;
            case CLOUDY:
                System.out.println("Looking for a sun!");
            break;
            default: break;
        }
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
