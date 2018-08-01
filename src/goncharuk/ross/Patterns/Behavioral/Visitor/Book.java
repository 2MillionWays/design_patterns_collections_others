package goncharuk.ross.Patterns.Behavioral.Visitor;

//Concrete element - java bean with an accept method
public class Book implements ItemElement {

    private int price;
    private String isbnNum;

    public int getPrice() {
        return price;
    }

    public String getIsbnNum() {
        return isbnNum;
    }

    public Book(int price, String isbnNum) {
        this.price = price;
        this.isbnNum = isbnNum;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
