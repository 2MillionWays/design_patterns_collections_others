package goncharuk.ross.Patterns.Behavioral.Iterator;

//Iterator interface
public interface ChannelIterator<E> {

    boolean hasNext();
    E next();
}
