package goncharuk.ross.Patterns.Behavioral.Memento;

//Originator class - an object, which state needs to be saved or restored
public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String file){
        this.fileName = file;
        this.content = new StringBuilder();
    }

    public void write(String str){
        content.append(str);
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public Memento save(){
        return new Memento(this.fileName,this.content);
    }
    public void undoLastSave(Object object){
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    //Memento - private inner class to save the states of the object
    //Might be public but with private constructor - object can be crated within outer class only - wide/narrow interfaces
    //Static/non-static
    private static class Memento{
        private String fileName;
        private StringBuilder content;

        private Memento(String fileName, StringBuilder content){
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }
}
