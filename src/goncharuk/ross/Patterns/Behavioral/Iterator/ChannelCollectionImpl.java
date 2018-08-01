package goncharuk.ross.Patterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;


public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    //Iterator fabric method implementation - return specific concrete iterator which is an implementation of an iterator interface
    @Override
    public ChannelIterator iterator(ChannelType channelType) {
        return new ChannelIteratorImpl(channelType);
    }

    private class ChannelIteratorImpl implements ChannelIterator<Channel>{

        private ChannelType channelType;
        private int position;

        public ChannelIteratorImpl(ChannelType channelType) {
            this.channelType = channelType;
        }

        @Override
        public boolean hasNext() {
            while (position < channelList.size()){
                Channel c = channelList.get(position);
                if (c.getChannelType().equals(channelType)){
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = channelList.get(position);
            position++;
            return channel;
        }
    }
}
