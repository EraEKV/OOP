package task3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayCollection<E> implements MyCollection<E> {
    private E[] elements;
    private int size;
    private int capacity;

    public ArrayCollection() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public ArrayCollection(int capacity) {
        this.capacity = capacity;
        this.elements = (E[]) new Object[capacity];
        this.size = 0;
    }

    private boolean checkFullCapacity() throws ArrayIndexOutOfBoundsException {
        if (size >= capacity) {
            throw new ArrayIndexOutOfBoundsException("Max capacity exception: " + capacity);
        }
        return false;
    }


    @Override
    public boolean add(E element) {
        if (checkFullCapacity()) return false;
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean addAll(MyCollection<? extends E> c) {
        boolean modified = false;
        for (E el : c) {
            if (add(el)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, elements[i])) {
                fastRemove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(MyCollection<E> c) {
        boolean modified = false;
        for (E el : c) {
            if (remove(el)) {
                modified = true;
            }
        }
        return modified;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, elements[i])) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
	@Override
    public boolean containsAll(MyCollection<?> c) {
        for (Object el : c) {
            if (!contains((E) el)) {
                return false;
            }
        }
        return true;
    }
    
    private String listElements() {
    	String res = "";
    	for(int i = 0; i < size; i++) {
    		res += (elements[i] + "\n");
    	}
    	
    	return res;
    }
    
    public void printElements() {
    	System.out.println(listElements());
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor = 0; // Tracks current position in the iteration.

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[cursor++];
            }

            @Override
            public void remove() {
                if (cursor <= 0) {
                    throw new IllegalStateException("Call next() before remove().");
                }
                fastRemove(--cursor);
            }
        };
    }

    
    
    
    @Override
    public String toString() {
    	return listElements();
    }
}
	