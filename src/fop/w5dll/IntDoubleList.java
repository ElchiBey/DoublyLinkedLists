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

    public int get(int pos){
        IntDoubleListElement curElement = head;
        for(int i=0; i<pos; i++){
            curElement = curElement.next;
        }
        return curElement.getInfo();
    }

    public void remove(int pos){
        if(pos == 0){
            head = head.next;
            if(head!=null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
        else {
            IntDoubleListElement curElement = head;
            for(int i=0; i<pos-1; i++){
                curElement = curElement.next;
            }
            curElement.next = curElement.next.next;
            if(curElement.next != null) {
                curElement.next.prev = curElement;
            } else {
                tail = curElement;
            }
        }
    }

    boolean isEqual(IntDoubleList other) {
        if (size() != other.size()) return false;
        IntDoubleListElement thisListCurElement = getLastElement();
        IntDoubleListElement otherListCurElement = other.getFirstElement();
        while (thisListCurElement != null) {
            if (!thisListCurElement.isEqual(otherListCurElement)) return false;
            thisListCurElement = thisListCurElement.next;
            otherListCurElement = otherListCurElement.next;
        }
        return true;
    }

    public int sum(){
        int sum = 0;
        IntDoubleListElement curElement = head;
        while(curElement != null) {
            sum += curElement.getInfo();;
            curElement = curElement.next;
        }
        return sum;
    }

    public IntDoubleList copy(){
        IntDoubleList listcopy = new IntDoubleList();
        IntDoubleListElement curElement = head;
        while(curElement!=null){
            listcopy.append(curElement.getInfo());
            curElement = curElement.next;
        }
        return listcopy;
    }

    public IntDoubleListElement[] search(int intValue){
        IntDoubleListElement[] elems = new IntDoubleListElement[size()];
        IntDoubleListElement curElement = head;
        int index = 0;
        while(curElement != null){
            if(curElement.getInfo() == intValue){
                elems[index] = curElement;
                index++;
            }
            curElement = curElement.next;
        }
        IntDoubleListElement[] result = new IntDoubleListElement[index];
        for(int i=0; i<index; i++){
            result[i] = elems[i];
        }
        return result;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        IntDoubleListElement curElement = head;
        while(curElement!=null) {
            result.append(curElement.getInfo());
            if(curElement.next!=null) result.append(", ");
            curElement = curElement.next;
        }
        return result.toString();
    }

}