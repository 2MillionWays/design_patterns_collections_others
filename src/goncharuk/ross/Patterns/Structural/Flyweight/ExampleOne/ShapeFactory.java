package goncharuk.ross.Patterns.Structural.Flyweight.ExampleOne;

import java.util.HashMap;

public class ShapeFactory {

    public enum ShapeType{
        OVAL_FILL, OVAL_NOFILL, LINE
    }

    private static final HashMap<ShapeType,Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType shapeType){
        Shape shape = shapes.get(shapeType);

        if (shape == null){
            if (shapeType.equals(ShapeType.OVAL_FILL)){
                shape = new Oval(true);
            } else if (shapeType.equals(ShapeType.OVAL_NOFILL)){
                shape = new Oval(false);
            } else if (shapeType.equals(ShapeType.LINE)){
                shape = new Line();
            }
            shapes.put(shapeType,shape);
        }
        return shape;
    }

}
