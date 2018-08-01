package goncharuk.ross.Other.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1;

    private Test test;
    private String name;
    private String position;
    private transient int ssn;

    public Employee(String name, String position, int ssn, Test test) {
        this.name = name;
        this.position = position;
        this.ssn = ssn;
        this.test = test;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "test = " + test +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", ssn=" + ssn +
                '}';
    }
}
