package goncharuk.ross.Patterns.Structural.Adapter.ExampleOne;

//Class Adapter Implementation - extending Socket Class (or it's interface)
public class SocketAdapterClassImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(3);
    }

    @Override
    public Volt get220Volt() {
        return convertVolt(220);
    }

    private Volt convertVolt(int i){
        return new Volt(i);
    }
}
