package goncharuk.ross.Patterns.Behavioral.Iterator;

public class Channel {

    private double frequency;
    private ChannelType channelType;

    public Channel(double frequency, ChannelType channelType) {
        this.frequency = frequency;
        this.channelType = channelType;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", channelType=" + channelType +
                '}';
    }
}
