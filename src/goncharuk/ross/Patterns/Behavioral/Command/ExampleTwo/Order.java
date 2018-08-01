package goncharuk.ross.Patterns.Behavioral.Command.ExampleTwo;

//Command
public abstract class Order {

    protected Stock stock;

    protected Order(Stock stock){
        this.stock = stock;
    }

    protected abstract void execute();
}
