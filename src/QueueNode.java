public class QueueNode {
    protected QueueNode prev;
    protected QueueNode next;
    protected Orderable value;

    public QueueNode getPrev() {
        return prev;
    }

    public void setPrev(QueueNode prev) {
        this.prev = prev;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public Orderable getValue() {
        return value;
    }

    public void setValue(Orderable value) {
        this.value = value;
    }
}
