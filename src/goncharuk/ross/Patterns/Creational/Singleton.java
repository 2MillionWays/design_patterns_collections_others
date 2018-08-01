package goncharuk.ross.Patterns.Creational;

public class Singleton {

    //Eager init - instance is always crated at the time of class load, even if we don't need it
    private static final Singleton instance = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {
        return instance;
    }

    //added field
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){return name;}
}

class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    //Static block init - Eager + Exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception! " + e.getMessage());
        }
    }
    private StaticBlockSingleton() {
    }
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton() {
    }

    //Lazy init - create instance in access method, i.e. when the object is needed
    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}

class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {
    }

    //Thread Safe Singleton - synchronized instance access method
    public static synchronized ThreadSafeSingleton getInstance(String empty) {
        if (instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }

    //Double check locking - increase performance of sync method that is needed for first few threads only
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null)
                    instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}

class BillPughSingleton{
    private BillPughSingleton(){}

    //Bill Pugh Singleton - instance of outer class located in private inner static class
    //Initialized on method call!
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

//Enums are singletons

enum EnumSingleton{
    INSTANCE;

    public static void doSomething(){
        //something to do
    }
}
