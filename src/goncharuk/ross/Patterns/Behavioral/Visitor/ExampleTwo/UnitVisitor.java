package goncharuk.ross.Patterns.Behavioral.Visitor.ExampleTwo;

//Visitor interface
public interface UnitVisitor {

    void visit(Soldier soldier);
    void visit(Captain captain);
}
