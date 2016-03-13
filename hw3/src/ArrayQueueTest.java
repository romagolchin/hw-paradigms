/**
 * Created by romag_000 on 28/02/2016.
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue small = new ArrayQueue();
        for(int i = 0; i < 9; ++i) {
            small.enqueue(i);
        }
        while(!small.isEmpty()) {
            System.out.println(small.size() + " " + small.element()
                    + " " + small.dequeue());
        }
        ArrayQueue large = new ArrayQueue();
        for(int i = 0; i < 67; ++i) {
            large.enqueue(i);
        }
        large.clear();
    }
}
