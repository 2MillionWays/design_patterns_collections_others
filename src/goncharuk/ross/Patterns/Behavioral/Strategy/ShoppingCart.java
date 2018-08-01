package goncharuk.ross.Patterns.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

//Context class - uses Strategy to define behavior
//Should have a link to Strategy object, but might not - depends on Context realization and/or contract
public class ShoppingCart {

    private List<Item> items;
    //Link to Strategy object
    private PaymentStrategy strategy;

    public ShoppingCart(){
        items = new ArrayList<>();
    }
    //constructor with strategy
    //Example = TreeMap(Comparator) & TreeSet(Comparator) constructors
    public ShoppingCart(PaymentStrategy strategy){
        items = new ArrayList<>();
        this.strategy = strategy;
    }

    //strategy setter
    public void changeStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calcTotal(){
        int sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    // Method DI - Payment Strategy required only as one-time use dependency and isn't stored in class
    //Examples - Collections.sort()
    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calcTotal());
    }

    //Method for composition (constructor) strategy
    public void pay(){
        strategy.pay(calcTotal());
    }
}
