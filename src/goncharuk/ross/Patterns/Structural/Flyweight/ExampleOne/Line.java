package goncharuk.ross.Patterns.Structural.Flyweight.ExampleOne;

import java.awt.*;

public class Line implements Shape {

    public Line(){
        System.out.println("Creating Object Line");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x,y,width,height);
    }
}
