package goncharuk.ross.Patterns.Behavioral.Command.ExampleTwo;

import java.util.ArrayList;
import java.util.List;

//Invoker class
public class Broker {

    private List<Order> orders;

    public Broker() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Order order){
        this.orders.add(order);
    }

    public void executeOrders(){
        for (Order order : orders)
            order.execute();
        orders.clear();
    }
}
