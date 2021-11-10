package fop.w5dll;

public class IntDoubleListElement {
    public IntDoubleListElement prev;
    public IntDoubleListElement next;
    private final int info;

    public IntDoubleListElement(int info) {
        this.info = info;
        prev = null;
        next = null;
    }

    public int getInfo() {
        return info;
    }

    boolean isEqual(IntDoubleListElement other) {
        return info == other.getInfo();
    }
}
