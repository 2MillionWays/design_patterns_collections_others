package goncharuk.ross.Patterns.Behavioral.Command;

//Receiver Interface
public interface FileSystemReceiver {
    void openFile();
    void closeFile();
    void writeFile();
}
