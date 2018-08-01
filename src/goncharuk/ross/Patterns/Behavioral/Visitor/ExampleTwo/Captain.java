package goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo;

//Concrete Element
public class Captain extends Unit  {

    public Captain(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Captain";
    }
}
