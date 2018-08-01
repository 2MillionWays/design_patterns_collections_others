package goncharuk.ross.Patterns.Behavioral.TemplateMethod;

//Template method concrete class - provides specific logic to necessary steps
public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Wooden Pillars");
    }
}
