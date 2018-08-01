package goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo;

//Concrete Element
public class Soldier extends Unit {

    public Soldier(Unit... children){
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
