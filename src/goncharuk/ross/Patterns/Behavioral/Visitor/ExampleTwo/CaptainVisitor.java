package goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo;

public class CaptainVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        //do nothing
    }

    @Override
    public void visit(Captain captain) {
        System.out.println("Sir! Greetings " + captain + ", Sir!");
    }
}
