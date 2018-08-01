package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain {

    private static final int NOTE_VALUE = 10;
    private DispenseChain chain;
    private int remainder;

    @Override
    public void setNextChain(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= NOTE_VALUE){
            int num = currency.getAmount()/NOTE_VALUE;
            int remainder = currency.getAmount()%NOTE_VALUE;
            System.out.println("Dispensing " +num+ "x $10 notes");
            if (remainder != 0) {
                this.remainder = remainder;
                System.out.println("Remainder = $" + remainder);
            }
        } else {
            remainder = currency.getAmount();
            System.out.println("Remainder = $" + remainder);
        }
    }
}
