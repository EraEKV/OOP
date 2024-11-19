package task3;

public interface MyCollection<E> extends Iterable<E> {
    boolean add(E element);
    
    boolean addAll(MyCollection<? extends E> c);
    
    boolean remove(E element);
    
    boolean removeAll(MyCollection<E> c);
    
    int size();
    
    boolean isEmpty();
    
    void clear();
    
    boolean contains(E element);
    
    boolean containsAll(MyCollection<?> c);
    
    void printElements();
}