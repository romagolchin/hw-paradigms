/**
 * Created by romag_000 on 28/02/2016.
 */

public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        for(int i = 0; i < 33; ++i) {
            ArrayQueueModule.enqueue(null);
        }
        Object[] arr = ArrayQueueModule.toArray();
        System.out.println(arr.length);
        for (Object anArr : arr) System.out.println(anArr);
        while(!ArrayQueueModule.isEmpty()) {
            System.out.println(ArrayQueueModule.size() + " " + ArrayQueueModule.element()
                    + " " + ArrayQueueModule.dequeue());
        }
        for(int i = 0; i < 33; ++i) {
            ArrayQueueModule.enqueue(i);
        }
        ArrayQueueModule.clear();
    }
}
