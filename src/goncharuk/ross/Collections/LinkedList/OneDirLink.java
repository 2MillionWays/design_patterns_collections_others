package goncharuk.ross.Collections.LinkedList;

//with pointers to first and last elements
public class OneDirLink<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;


    public void add(T element){
        Node<T> l = last;
        Node<T> newNode = new Node<>(element,null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public void add(int index, T element){
        if (index == size)
            add(element);
        //TODO: if (index == 0)
        else {
            Node<T> prev = get(index - 1);
            Node<T> newNode = new Node<>(element, get(index));
            if (prev == null)
                first = newNode;
            else
                prev.next = newNode;
            size++;
        }
    }

    public T getFirst(){
        return first.element;
    }
    public T getLast(){
        return last.element;
    }

    public Node<T> get(int index){
        if (index > size-1)
            throw new IndexOutOfBoundsException();
        Node<T> result = first;
        for (int i = 0; i < index; i++)
            result = result.next;
        return result;
    }

    private static class Node<T>{
        private T element;
        private Node<T> next;

        Node(T element, Node<T> next){
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(first.toString());
        Node current = first;
        while (current.next != null){
            stringBuilder.append(", ");
            stringBuilder.append(current.next.toString());
            current = current.next;
        }
        return stringBuilder.toString();
    }
}
