package goncharuk.ross.Patterns.Creational.Factory;

//Super Class might be an interface, abstract class or normal class
public abstract class SuperClass implements SuperClassInterface{
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM = " +getRAM() +
                " CPU = " + getCPU() +
                " HDD = " + getHDD();
    }
}
