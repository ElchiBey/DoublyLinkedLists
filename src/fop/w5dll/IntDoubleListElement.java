package fop.w5dll;

public class IntDoubleListElement {
	private int info;
    public IntDoubleListElement prev;
    public IntDoubleListElement next;

    public IntDoubleListElement(int info){
        this.info = info;
        prev = null;
        next = null;
    }

    public int getInfo(){
        return info;
    }
}
