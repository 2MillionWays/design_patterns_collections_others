package goncharuk.ross.Patterns.Creational.Builder;

public class Computer {

    private String ram;
    private String cpu;
    private String hdd;
    //Optional fields
    private boolean isOld;

    //builder pattern example StringBuilder#append();

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isOld() {
        return isOld;
    }

    private Computer(ComputerBuilder computerBuilder){
        this.cpu = computerBuilder.cpu;
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.isOld = computerBuilder.isOld;
    }

    public static class ComputerBuilder{
        private String ram;
        private String cpu;
        private String hdd;
        //Optional field
        private boolean isOld;

        public ComputerBuilder(String ram, String cpu, String hdd) {
            this.ram = ram;
            this.cpu = cpu;
            this.hdd = hdd;
            //no optional field!
        }
        public ComputerBuilder setIsOld(boolean isOld){
            this.isOld = isOld;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isOld=" + isOld +
                '}';
    }
}
