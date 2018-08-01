package goncharuk.ross.Patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;


//Composite object
public class Drawing implements Shape {

    private List<Shape> shapes;

    public Drawing(){
        shapes = new ArrayList<>();
    }

    @Override
    public void draw(String color) {
        for (Shape shape : shapes){
            shape.draw(color);
        }
    }

    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public void remove(Shape shape){
        this.shapes.remove(shape);
    }

    public void removeAll(){
        this.shapes.clear();
    }
}
