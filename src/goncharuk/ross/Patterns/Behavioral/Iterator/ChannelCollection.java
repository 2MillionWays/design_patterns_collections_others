package goncharuk.ross.Patterns.Behavioral.Iterator;

public interface ChannelCollection {

    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    //Iterator fabric method
    ChannelIterator iterator(ChannelType channelType);

}
