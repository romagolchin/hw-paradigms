/**
 * Created by romag_000 on 07/03/2016.
 */
public class QueueTest {
    public static void main(String args[]) {
        Queue queue = new LinkedQueue();
        for(int i = 0; i < 32; ++i)
            queue.enqueue(i);
        while(!queue.isEmpty()) {
            System.out.println(queue.size() + " " + queue.element()
                    + " " + queue.dequeue());
        }
    }
}
