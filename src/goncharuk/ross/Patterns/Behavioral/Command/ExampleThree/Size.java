package goncharuk.ross.Patterns.Behavioral.Command.ExampleThree;

public enum Size {

    SMALL("small"), NORMAL("normal");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
