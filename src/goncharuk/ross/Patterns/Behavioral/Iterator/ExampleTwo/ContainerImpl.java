package goncharuk.ross.Patterns.Behavioral.Iterator.ExampleTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Concrete Aggregate
public class ContainerImpl<T> implements Container {

    private List<T> list;

    public ContainerImpl(){
        list = new ArrayList<>();
    }
    public void add(T... items){
        list.addAll(Arrays.asList(items));
    }
    public void remove(T item){
        list.remove(item);
    }

    @Override
    public Iterator iterator() {
        return new ContainerIterator();
    }

    //Concrete iterator
    private class ContainerIterator implements Iterator<T>{

        private int index;

        @Override
        public boolean hasNext() {
            return index< list.size();
        }

        @Override
        public T next() {
            T item = list.get(index);
            index++;
            return item;
        }
    }
}
