package goncharuk.ross.Patterns.Behavioral.Interpreter;

//Expression Interface - defines an interpret method
public interface Expression {

    String interpret(InterpreterContext context);
}
