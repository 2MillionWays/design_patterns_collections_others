package goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo;

public class Orc implements WeatherObserver {

    private Weather weather;
    private String state;

    public Orc(Weather weather){
        this.weather = weather;
    }

    @Override
    public void update() {
        switch (weather.getCurrentWeather()) {
            case CLOUDY:
                System.out.println("Orc like!");
                break;
            case WINDY:
                System.out.println("Orcs don't care for wind!");
                break;
            case SUNNY:
                System.out.println("Orcs hate the sun!");
                break;
            case RAINY:
                System.out.println("Orcs don't care for rain!");
                break;
            default:
                break;
        }
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
