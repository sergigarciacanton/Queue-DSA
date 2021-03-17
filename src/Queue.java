//import java.util.Collection;

public interface Queue<E> { // extends Collection<E>

    void push(E e) throws FullQueueException ;
    E pop() throws EmptyQueueException ;
    int size();
}
