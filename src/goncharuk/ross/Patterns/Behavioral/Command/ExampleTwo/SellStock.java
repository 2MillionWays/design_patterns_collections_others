package goncharuk.ross.Patterns.Behavioral.Command.ExampleTwo;

//Concrete command
public class SellStock extends Order {

    public SellStock(Stock stock) {
        super(stock);
    }

    @Override
    protected void execute() {
        this.stock.sell();
    }
}
