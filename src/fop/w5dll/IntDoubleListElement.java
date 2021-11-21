package fop.w5dll;

public class IntDoubleListElement {
    private int info;
    public IntDoubleListElement prev;
    public IntDoubleListElement next;


    public IntDoubleListElement(int info) {
        this.info = info;
        prev = null;
        next = null;
    }

    public int getInfo() {
        return info;
    }

    boolean isEqual(IntDoubleListElement other) {
        return (info == other.getInfo());
    }

//    public IntDoubleListElement getNext() {
//        return next;
//    }
//
//    public void setNext(IntDoubleListElement next) {
//        this.next = next;
//    }

    public IntDoubleListElement getPrev() {
        return prev;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setPrev(IntDoubleListElement prev) {
        this.prev = prev;
    }
}
