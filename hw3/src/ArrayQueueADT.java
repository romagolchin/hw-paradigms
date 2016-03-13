/**
 * Created by romag_000 on 28/02/2016.
 */

//inv: n >= 0, a[i], 1 <= i <= n
public class ArrayQueueADT {
    private Object a[] = new Object[8];
    private int size = 0;
    private int head = 0;
    private int tail = 0;
    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if(queue.a.length < capacity) {
            Object[] b = new Object[2 * queue.a.length];
            for(int i = 0; i < queue.size; ++i) {
                b[i] = queue.a[(queue.head + i) % queue.a.length];
            }
            queue.a = b;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }
    //pre:
    //post: a'[i] = a[i], 1 <= i <= n, n' = n + 1, a'[n'] = element
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.a[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.a.length;
        ++queue.size;
    }
    //pre:
    //post: a'[i] = a[i + 1], 1 <= i <= n - 1, n' = n - 1
    public static Object dequeue(ArrayQueueADT queue) {
        Object res = queue.a[queue.head];
        queue.a[queue.head] = null;
        queue.head = (queue.head + 1) % queue.a.length;
        --queue.size;
        return res;
    }
    //pre: n != 0
    //post: R = a[1]
    public static Object element(ArrayQueueADT queue) {
        return queue.a[queue.head];
    }
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
    //post: size = 0, empty sequence a
    public static void clear(ArrayQueueADT queue) {
        for(int i = 0; i < queue.size; ++i) {
            queue.a[(queue.head + i) % queue.a.length] = null;
        }
        queue.size = 0;
        queue.head = queue.tail = 0;
    }
    //pre:
    //post: R = array containing a[i]
    public static Object[] toArray(ArrayQueueADT queue) {
        Object[] res = new Object[queue.size];
        for(int i = 0; i < queue.size; ++i)
            res[i] = queue.a[(queue.head + i) % queue.a.length];
        return res;
    }
}

