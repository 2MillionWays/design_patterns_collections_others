package goncharuk.ross.Patterns.Structural.Flyweight.ExampleOne;

import java.awt.*;

//Flyweight interface
public interface Shape {

    void draw(Graphics g, int x, int y, int width, int height, Color color);
}
