package goncharuk.ross.Patterns.Behavioral.Observer.ExampleTwo;

public enum  WeatherType {
    SUNNY,
    WINDY,
    CLOUDY,
    RAINY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
