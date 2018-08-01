package goncharuk.ross.Patterns.Behavioral.Command.ExampleTwo;

//Concrete command
public class BuyStock extends Order {

    public BuyStock(Stock stock) {
        super(stock);
    }

    @Override
    protected void execute() {
        this.stock.buy();
    }
}
