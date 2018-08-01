package goncharuk.ross.Patterns.Other.MVC;

//Model class
public class Student {

    private String name;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student() {
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }
}
