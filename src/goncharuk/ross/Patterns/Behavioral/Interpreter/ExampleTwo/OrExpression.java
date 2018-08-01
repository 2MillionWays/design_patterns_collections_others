package goncharuk.ross.Patterns.Behavioral.Interpreter.ExampleTwo;

//non-terminal expression
public class OrExpression implements ExpressionExTwo {

    private ExpressionExTwo expr1 = null;
    private ExpressionExTwo expr2 = null;

    public OrExpression(ExpressionExTwo expr1, ExpressionExTwo expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
