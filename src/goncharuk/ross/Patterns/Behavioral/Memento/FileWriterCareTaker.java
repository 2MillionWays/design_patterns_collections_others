package goncharuk.ross.Patterns.Behavioral.Memento;

//Caretaker - contains the saved state in form of an Object
// so it cannot alter it's data and has no knowledge of its structure
public class FileWriterCareTaker {

    private Object object;

    public void save(FileWriterUtil fileWriterUtil){
        this.object = fileWriterUtil.save();
    }
    public void undo(FileWriterUtil fileWriterUtil){
        fileWriterUtil.undoLastSave(object);
    }
}
