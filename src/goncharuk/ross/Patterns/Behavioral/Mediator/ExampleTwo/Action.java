package goncharuk.ross.Patterns.Behavioral.Mediator.ExampleTwo;

public enum Action {
    HUNT("Hunting", "Hunting a monster"),
    TALE("Tells a Tale", "Comes to listen"),
    GOLD("Found Gold", "Takes his share of Gold"),
    ENEMY("Spotted enemies", "Calls for help"),
    NONE("", "");

    private String title;
    private String description;

    Action(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}
