package goncharuk.ross.Patterns.Behavioral.Interpreter.ExampleTwo;

//Context - global information for interpreter
public class Context {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Context(String str) {
        this.str = str;
    }
}
