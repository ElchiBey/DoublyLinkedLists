package fop.w5dll;

public class IntDoubleList {
    private IntDoubleListElement head;
    private IntDoubleListElement tail;

    public IntDoubleList() {
        head = null;
        tail = null;
    }

    public IntDoubleListElement getFirstElement() {
        return head;
    }

    public IntDoubleListElement getLastElement() {
        return tail;
    }

    public void append(int info) {
        IntDoubleListElement newElement = new IntDoubleListElement(info);
        if (head == null && tail == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.next = newElement;
            newElement.prev = tail;
            tail = newElement;
        }
    }

    public int size() {
        IntDoubleListElement curElement = head;
        int count = 0;
        while (curElement != null) {
            count++;
            curElement = curElement.next;
        }
        return count;
    }

}