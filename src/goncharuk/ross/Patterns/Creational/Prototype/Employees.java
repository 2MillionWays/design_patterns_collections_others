package goncharuk.ross.Patterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> list;

    public Employees(){
        list = new ArrayList<>();
    }
    public Employees(List<String> list){
        this.list = list;
    }
    public List<String> getList(){
        return list;
    }

    public void loadData(){
        list.add("Ross");
        list.add("Bruce");
        list.add("Arnold");
        list.add("Chuck");
    }

    @Override
    public Employees clone() {
        List<String> temp = new ArrayList<>(this.list);
        /*List<String> temp = new ArrayList<>();
        for (String s : this.list)
            temp.add(s);*/
        return new Employees(temp);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "list=" + list +
                '}';
    }
}
