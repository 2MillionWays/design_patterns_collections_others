package goncharuk.ross.Patterns.Structural.Adapter.ExampleOne;

//rozetka)
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
