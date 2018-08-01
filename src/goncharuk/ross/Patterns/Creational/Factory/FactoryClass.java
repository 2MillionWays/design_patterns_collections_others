package goncharuk.ross.Patterns.Creational.Factory;

//Factory Class might be a singleton or a static method
public class FactoryClass {

    //Singleton
    private FactoryClass(){}
    private static FactoryClass instance;
    public static FactoryClass getInstance(){
        if (instance == null)
            instance = new FactoryClass();
        return instance;
    }
    //FACTORY METHOD
    public SuperClassInterface getSuperClass(String type, String ram, String hdd, String cpu){
        //use if or switch
        switch (type.toLowerCase()){
            case "subone" : return new SubClassOne(ram,cpu,hdd);
            case "subtwo" : return new SubClassTwo(ram,cpu,hdd);
            default: return null;
        }
    }

    // Static method - no instance needed - access through class
    //FACTORY METHOD
    public static SuperClassInterface getSuperClassStatic(String type, String ram, String hdd, String cpu){
        if (type.equalsIgnoreCase("SubOne"))
            return new SubClassOne(ram,cpu,hdd);
        else if (type.equalsIgnoreCase("SubTwo"))
            return new SubClassTwo(ram, cpu, hdd);
        return null;
    }
}
