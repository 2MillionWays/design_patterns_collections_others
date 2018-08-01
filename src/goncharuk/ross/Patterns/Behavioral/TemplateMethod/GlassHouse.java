package goncharuk.ross.Patterns.Behavioral.TemplateMethod;

//Template method concrete class - provides specific logic to necessary steps
public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Walls of Glass Plates");
    }

    @Override
    public void buildPillars() {
        System.out.println("Pillars with Glass coating");
    }
}
