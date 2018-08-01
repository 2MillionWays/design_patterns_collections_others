package goncharuk.ross.Patterns.Behavioral.Command;

//concrete receiver
public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file on Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows");
    }
}
