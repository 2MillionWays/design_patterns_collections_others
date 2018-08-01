package goncharuk.ross.Other.Serialization;

import java.io.Serializable;

public class Test implements Serializable {

    private int value;
    //private int secondValue;

    public Test(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "value=" + value +
                '}';
    }
}
