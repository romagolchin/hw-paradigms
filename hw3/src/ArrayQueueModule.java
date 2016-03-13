import java.util.Objects;

/**
 * Created by romag_000 on 27/02/2016.
 */

//inv: n >= 0, a[i], 1 <= i <= n
public class ArrayQueueModule {
    private static Object a[] = new Object[8];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;
    //pre: capacity >= 0
    //post: enough memory allocated for a[i]
    private static void ensureCapacity(int capacity) {
        if(a.length < capacity) {
            Object[] b = new Object[2 * a.length];
            for(int i = 0; i < size; ++i) {
                b[i] = a[(head + i) % a.length];
            }
            a = b;
            head = 0;
            tail = size;
        }
    }

    //pre:
    //post: a'[i] = a[i], 1 <= i <= n, n' = n + 1, a'[n'] = element
    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        a[tail] = element;
        tail = (tail + 1) % a.length;
        ++size;
    }
    //pre:
    //post: a'[i] = a[i + 1], 1 <= i <= n - 1, n' = n - 1
    public static Object dequeue() {
        Object res = a[head];
        a[head] = null;
        head = (head + 1) % a.length;
        --size;
        return res;
    }
    //pre: n != 0
    //post: R = a[1]
    public static Object element() {
        return a[head];
    }
    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    //post: size = 0, empty sequence a
    public static void clear() {
        for(int i = 0; i < size; ++i) {
            a[(head + i) % a.length] = null;
        }
        size = 0;
        head = tail = 0;
    }
    //pre:
    //post: R = array containing a[i]
    public static Object[] toArray() {
        Object[] res = new Object[size];
        for(int i = 0; i < size; ++i) {
            res[i] = a[(head + i) % a.length];
        }
        return res;
    }
}
