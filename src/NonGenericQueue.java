public class NonGenericQueue {
    private Box front;
    private Box back;

    public void enqueue(Object element) {
        if (element == null)
            return;

        if (isEmpty()) {
            front = new Box(element);
            back = front;
        } else {
            back.setNext(new Box(element));
            back = back.getNext();
        }
    }

    public void dequeue() {
        if (isEmpty())
            return;

        if (front == back) {
            front = null;
            back = null;
        } else {
            front = front.getNext();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public Object getFirst() {
        return front.getElement();
    }

    public Object getLast() {
        return back.getElement();
    }

    private class Box {
        private Object element;
        private Box next;

        public Box(Object element) {
            this.element = element;
            this.next = null;
        }

        public Object getElement() {
            return element;
        }

        public void setElement(Object element) {
            this.element = element;
        }

        public Box getNext() {
            return next;
        }

        public void setNext(Box next) {
            this.next = next;
        }
    }
}
