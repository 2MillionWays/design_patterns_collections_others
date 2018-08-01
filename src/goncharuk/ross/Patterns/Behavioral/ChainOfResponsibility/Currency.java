package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility;

//Object to be used in chain handlers - Request
public class Currency {

    private int amount;

    public Currency(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
