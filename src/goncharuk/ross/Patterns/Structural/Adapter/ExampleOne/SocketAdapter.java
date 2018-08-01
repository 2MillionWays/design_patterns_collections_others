package goncharuk.ross.Patterns.Structural.Adapter.ExampleOne;


public interface SocketAdapter {

    Volt get120Volt();
    Volt get3Volt();
    Volt get220Volt();
}
