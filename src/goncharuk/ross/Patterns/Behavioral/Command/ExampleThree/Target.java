package goncharuk.ross.Patterns.Behavioral.Command.ExampleThree;

//Receiver base class
public abstract class Target {
    private Size size;

    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();

    /**
     * Print status
     */
    public void printStatus() {
        System.out.println(this + " size = " + getSize() + " visibility = " + getVisibility());
    }
}
