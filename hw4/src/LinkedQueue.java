/**
 * Created by romag_000 on 06/03/2016.
 */
public class LinkedQueue extends AbstractQueue{
    Node tail = new Node(null, null);
    Node head = new Node(null, tail);
    public void enqueueImpl(Object element) {
        Node newTail = new Node(null, null);
        tail.val = element;
        tail.next = newTail;
        tail = newTail;
    }
    public Object dequeueImpl() {
        Object res = head.next.val;
        head.next = head.next.next;
        return res;
    }
    public Object element() {
        return head.next.val;
    }
}

