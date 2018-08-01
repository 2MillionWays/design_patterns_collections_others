package goncharuk.ross.Patterns.Structural.Flyweight.ExampleOne;

import java.awt.*;

public class Oval implements Shape {

    //intrinsic field
    private boolean isFill;

    public Oval(boolean isFill){
        this.isFill = isFill;
        System.out.println("Creating Object Oval");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x,y,width,height);
        if (isFill)
            circle.fillOval(x,y,width,height);
    }
}
