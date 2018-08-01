package goncharuk.ross.Collections.LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

//with a single pointer to the first element
public class SingleLinkedList<T> implements Iterable<T> {

    private Node<T> first;
    private int size;

    public SingleLinkedList() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item, null);
        Node<T> current = first;
        if (current == null) {
            first = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public Node<T> get(int index) {
        Node<T> result = first;
        if (index > size - 1)
            throw new IndexOutOfBoundsException();
        for (int i = 0; i < index; i++)
            result = result.next;
        return result;
    }

    public boolean remove(T data) {
        Node<T> current = first;
        Node<T> prev = first;
        while (current != null){
            if (data.equals(current.data) && current == first) {
                removeFirst();
                return true;
            }
            if (data.equals(current.data)) {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public void removeFirst() {
        if (first.next == null) {
            first = null;
            size--;
        } else {
            first = first.next;
            size--;
        }
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            String nextNode = (next == null) ? "null" : next.data.toString();
            return data.toString() + " -> " + nextNode;
        }
    }

    public Node<T> getFirst() {
        return first;
    }

    public Iterator<T> iterator() {
        return new SingleLinkedListIterator();
    }

    private class SingleLinkedListIterator implements Iterator<T> {
        private Node<T> current = first;
        private Node<T> prev = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            T data = current.data;
            prev = current;
            current = current.next;
            return data;
        }

        @Override
        public void remove() {
            if (current == first){
                first = first.next;
                size--;
            } else {
                prev.next = current.next;
                size--;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<T> iterator = iterator();
        if (!iterator.hasNext())
            return "[]";
        stringBuilder.append("[");
        while (iterator.hasNext()){
            T item = iterator.next();
            stringBuilder.append(item);
            if (!iterator.hasNext())
                return stringBuilder.append("]").toString();
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}
