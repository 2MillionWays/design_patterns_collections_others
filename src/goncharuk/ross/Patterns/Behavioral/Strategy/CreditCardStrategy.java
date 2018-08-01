package goncharuk.ross.Patterns.Behavioral.Strategy;

//Concrete strategy - concrete implementation of an algorithm
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private int cardNumber;
    private int cvv;
    private String expirationDate;

    public CreditCardStrategy(String name, int cardNumber, int cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with a Credit Card " + cardNumber);
    }
}
