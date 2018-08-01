package goncharuk.ross.Patterns.Creational.Factory;

//Sub class of Super Class
//Concrete Products
public class SubClassOne extends SuperClass {

    private String ram;
    private String cpu;
    private String hdd;

    public SubClassOne(String ram, String cpu, String hdd){
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String toString(){
        return SubClassOne.class.getSimpleName() +
                ": " + super.toString();
    }
}
