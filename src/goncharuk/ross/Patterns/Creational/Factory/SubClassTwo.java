package goncharuk.ross.Patterns.Creational.Factory;

//Concrete Products
public class SubClassTwo extends SuperClass {

    private String ram;
    private String cpu;
    private String hdd;

    public SubClassTwo(String ram, String cpu, String hdd){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd =hdd;
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
        return SubClassTwo.class.getSimpleName() +
                ": " + super.toString();
    }

}
