package goncharuk.ross.Patterns.Behavioral.TemplateMethod;

//Template method Abstract class - base class
public abstract class HouseTemplate {

    //template method - fixed algorithm, while leaving some steps opened to changes/implementations
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is ready!");
    }

    //methods with default implementation for all subclasses - HOOKS - intended to be overridden by sub classes
    //private - cannot be inherited/overridden - can be final as well
    private void buildFoundation(){
        System.out.println("Building Foundation!");
    }
    private void buildWindows(){
        System.out.println("Inserting Frames and Windows");
    }

    //methods (steps) to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();
}
