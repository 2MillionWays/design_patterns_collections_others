package goncharuk.ross.Patterns.Behavioral.Command;

//concrete receiver
public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file on Unix");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix");
    }
}
