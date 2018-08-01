package goncharuk.ross.Other.ImmutableMutable;

public final class ImmutableTest {

    private final int id;
    private final MutableTest person;

    public ImmutableTest(final int id, final MutableTest person){
        this.id = id;
        this.person = new MutableTest(person.getFirstName(),
                person.getLastName(),
                person.getAge());
    }

    public int getId(){
        return id;
    }
    public MutableTest getPerson(){
        return (MutableTest) person.clone(); //new MutableTest(person.getFirstName(),person.getLastName(),person.getAge());
    }

    @Override
    public String toString() {
        return "ImmutableTest{" +
                "id=" + id +
                ", person=" + person.toString() +
                '}';
    }
}
