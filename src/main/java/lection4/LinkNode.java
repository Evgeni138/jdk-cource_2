package lection4;

public class LinkNode {
    private int value;
    private LinkNode previous, next;

    public LinkNode(int value, LinkNode previous, LinkNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinkNode previous) {
        this.previous = previous;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
