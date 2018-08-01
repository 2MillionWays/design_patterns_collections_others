package goncharuk.ross.Other.ImmutableMutable;

public class MutableTest implements Cloneable {

    private String firstName;
    private String lastName;
    private int age;

    public MutableTest(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MutableTest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() {
        MutableTest result;
        try {
            result = (MutableTest)super.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
