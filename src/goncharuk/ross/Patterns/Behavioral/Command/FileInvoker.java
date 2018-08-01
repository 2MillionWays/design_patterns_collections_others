package goncharuk.ross.Patterns.Behavioral.Command;

//Invoker - invokes command to execute request
public class FileInvoker {

    private Command command;

    public FileInvoker() {
    }

    public FileInvoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
