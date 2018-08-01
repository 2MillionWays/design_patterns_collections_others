package goncharuk.ross.Patterns.Structural.Adapter.ExampleTwo;


//Adapter that adds Fishing boat to Rowing boat interface (composition)
public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter(){
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
