package goncharuk.ross.Patterns.Behavioral.Visitor;

//Concrete element - java bean with an accept method
public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
