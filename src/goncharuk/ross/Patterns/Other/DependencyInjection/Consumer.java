package goncharuk.ross.Patterns.Other.DependencyInjection;

//Consumer interface - not necessary
public interface Consumer {
    void processMessage(String msg, String rec);
}
