package goncharuk.ross.Patterns.Structural.Adapter.ExampleTwo;

public class FishingBoatAdapterClass extends FishingBoat implements RowingBoat {

    @Override
    public void row() {
        super.sail();
    }
}
