package goncharuk.ross.Patterns.Structural.Adapter.ExampleOne;

//Object Adapter implementation - class contains an instance of Socket Class (composition)
public class SocketAdapterObjectImpl implements SocketAdapter {

    private Socket socket;

    public SocketAdapterObjectImpl(){
        this.socket = new Socket();
    }

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(3);
    }

    @Override
    public Volt get220Volt() {
        return convertVolt(220);
    }

    public Volt convertVolt(int i){
        return new Volt(i);
    }
}
