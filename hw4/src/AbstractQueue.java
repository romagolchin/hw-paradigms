/**
 * Created by romag_000 on 06/03/2016.
 */
public abstract class AbstractQueue implements Queue{
    private int size = 0;
    //pre:
    //post: a'[i] = a[i], 1 <= i <= n, n' = n + 1, a'[n'] = element
    public void enqueue(Object element) {
        enqueueImpl(element);
        ++size;
    }
    //pre:
    //post: a'[i] = a[i + 1], 1 <= i <= n - 1, n' = n - 1
    public abstract void enqueueImpl(Object element);
    public Object dequeue() {
        Object res = dequeueImpl();
        --size;
        return res;
    }
    public abstract Object dequeueImpl();

    public abstract Object element();
    public void clear() {
        for(int i = 0; i < size; ++i) {
            Object dequeue = dequeue();
        }

    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
