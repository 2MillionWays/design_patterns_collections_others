package goncharuk.ross.Patterns.Behavioral.Visitor;

//Visitor interface - defines a visit methods for different type of items to be impl by concrete visitor classes
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
