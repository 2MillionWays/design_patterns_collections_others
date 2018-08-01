package goncharuk.ross.Patterns.Behavioral.Visitor;

//Concrete Visitor
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book " + book.getIsbnNum() + ", price = " + book.getPrice());
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " total price = " + cost);
        return cost;
    }
}
