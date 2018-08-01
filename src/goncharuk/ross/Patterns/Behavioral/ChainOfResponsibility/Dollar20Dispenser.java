package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility;

//concrete handler
public class Dollar20Dispenser implements DispenseChain {

    private static final int NOTE_VALUE = 20;
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= NOTE_VALUE){
            int num = cur.getAmount()/NOTE_VALUE;
            int remainder = cur.getAmount() % NOTE_VALUE;
            System.out.println("Dispensing "+num+"x $20 notes");
            if(remainder !=0)
                this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
