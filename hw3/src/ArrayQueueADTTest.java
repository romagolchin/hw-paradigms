/**
 * Created by romag_000 on 28/02/2016.
 */
public class ArrayQueueADTTest {
    public static void main(String[] args) {
        ArrayQueueADT small = new ArrayQueueADT();
        for(int i = 0; i < 9; ++i) {
            ArrayQueueADT.enqueue(small, i);
        }
        while(!ArrayQueueADT.isEmpty(small)) {
            System.out.println(ArrayQueueADT.size(small) + " " + ArrayQueueADT.element(small)
                    + " " + ArrayQueueADT.dequeue(small));
        }
        ArrayQueueADT large = new ArrayQueueADT();
        for(int i = 0; i < 67; ++i) {
            ArrayQueueADT.enqueue(large, i);
        }
        Object[] arr = ArrayQueueADT.toArray(large);
        System.out.println(arr.length);
        for (Object anArr : arr) System.out.println(anArr);
        ArrayQueueADT.clear(large);
    }
}
