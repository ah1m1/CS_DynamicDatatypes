public class Queue<T> {
    private Box front;
    private Box back;

    public void enqueue(T element) {
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

        if(front == back) {
            front = null;
            back = null;
        } else {
            front = front.getNext();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    private class Box {
        private T element;
        private Box next;

        public Box(T element) {
            this.element = element;
            this.next = null;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
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
