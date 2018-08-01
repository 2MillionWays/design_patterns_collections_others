package goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo;

//Concrete Visitor
public class SoldierVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
        System.out.println("Hello " + soldier);
    }

    @Override
    public void visit(Captain captain) {
        //do nothing
    }
}
