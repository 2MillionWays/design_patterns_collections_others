package goncharuk.ross.Patterns.Behavioral.Visitor;

//Element interface - defines accept operation that requires a visitor as an argument
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
