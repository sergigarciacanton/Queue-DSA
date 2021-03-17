public class QueueImpl<E> implements Queue<E> {
    private final E[] data;
    private int p;

    public QueueImpl(int length) {
        this.p = 0;
        data = (E[])new Object[length];
    }

    public boolean isEmpty() {
        return p == 0;
    }

    public boolean isFull() {
        return p >= data.length;
    }

    public void push(E e) throws FullQueueException {
        if(isFull()) throw new FullQueueException();
        data[p] = e;
        p++;
    }
    public E pop() throws EmptyQueueException {
        if(isEmpty()) throw new EmptyQueueException();
        E out = data[0];
        for(int i = 0; i < p - 1; i++) {
            data[i] = data[i + 1];
        }
        data[p] = null;
        p--;
        return out;
    }
    public int size() {
        return this.p;
    }
}
