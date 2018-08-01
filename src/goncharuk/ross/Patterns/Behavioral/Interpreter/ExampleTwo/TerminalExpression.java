package goncharuk.ross.Patterns.Behavioral.Interpreter.ExampleTwo;

//terminal final expression
public class TerminalExpression implements ExpressionExTwo {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        if(context.getStr().contains(data)){
            return true;
        }
        return false;
    }
}
