package goncharuk.ross.Patterns.Behavioral.Command.ExampleTwo;

//Receiver class
public class Stock {

    private String itemName = "Bottle";
    private int quantity = 10;

    public void buy(){
        System.out.println("Items \"" + itemName +
                "\" in quantity " + quantity + " purchased");
    }

    public void sell(){
        System.out.println("Items \"" + itemName +
                "\" in quantity " + quantity + " sold");
    }
}
