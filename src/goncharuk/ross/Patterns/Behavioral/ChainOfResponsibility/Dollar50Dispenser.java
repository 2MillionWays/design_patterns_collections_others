package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility;


//Concrete Handler
public class Dollar50Dispenser implements DispenseChain {

    private static final int NOTE_VALUE = 50;
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= NOTE_VALUE){
            int num = currency.getAmount()/NOTE_VALUE;
            int remainder = currency.getAmount()%NOTE_VALUE;
            System.out.println("Dispensing " +num+ "x $50 notes");
            if (remainder != 0)
                this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(currency);
        }
    }
}
